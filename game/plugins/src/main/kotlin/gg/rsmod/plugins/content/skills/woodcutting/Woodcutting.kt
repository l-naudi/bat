package gg.rsmod.plugins.content.skills.woodcutting

import gg.rsmod.game.fs.def.ItemDef
import gg.rsmod.game.model.entity.DynamicObject
import gg.rsmod.game.model.entity.GameObject
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.plugins.api.Skills
import gg.rsmod.plugins.api.ext.*

object Woodcutting {

    suspend fun chop(it: QueueTask, obj: GameObject, tree: Tree) {
        val p = it.player

        if (!canChop(p, obj, tree)) {
            return
        }

        val log = p.world.definitions.get(ItemDef::class.java, tree.id).name.toLowerCase()
        val axe = Axe.bestFor(p)!!

        p.filterableMessage("You swing your axe at the tree.")

        while (true) {
            p.animate(axe.animation)
            it.wait(2)

            if (!canChop(p, obj, tree)) {
                p.animate(-1)
                break
            }

            val level = p.getSkills().getCurrentLevel(Skills.WOODCUTTING)

            if (level.interpolate(minChance = 60, maxChance = 190, minLvl = 1, maxLvl = 99, cap = 255)) {
                p.filterableMessage("You get some ${log.pluralSuffix(2)}.")
                p.playSound(3600)

                p.inventory.add(tree.id)
                p.addXp(Skills.WOODCUTTING, tree.xp)

                if (p.world.random(tree.chance) == 0) {
                    p.animate(-1)

                    val world = p.world

                    world.queue {
                        val stump = DynamicObject(obj, tree.stump)

                        world.remove(obj)
                        world.spawn(stump)

                        wait(tree.respawn.random())

                        world.remove(stump)
                        world.spawn(DynamicObject(obj))
                    }

                    break
                }

                // TODO birds nests
            }

            it.wait(2)
        }
    }

    private fun canChop(p: Player, obj: GameObject, tree: Tree): Boolean {
        if (!p.world.isSpawned(obj)) {
            return false
        }

        val axe = Axe.bestFor(p)

        if (axe == null) {
            p.message("You need an axe to chop down this tree.")
            p.message("You do not have an axe which you have the woodcutting level to use.")
            return false
        }

        if (p.getSkills().getMaxLevel(Skills.WOODCUTTING) < tree.level) {
            p.message("You need a Woodcutting level of ${tree.level} to chop down this tree.")
            return false
        }

        if (p.inventory.isFull) {
            p.message("Your inventory is too full to hold any more logs.")
            return false
        }

        return true
    }
}