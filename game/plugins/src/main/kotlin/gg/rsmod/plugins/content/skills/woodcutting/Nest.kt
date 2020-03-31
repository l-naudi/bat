package gg.rsmod.plugins.content.skills.woodcutting

import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.cfg.Items

enum class Nest(val item: Int, val loot: List<Int>) {
    RED_EGG(item = Items.BIRD_NEST, loot = listOf(5076)),
    GREEN_EGG(item = Items.BIRD_NEST_5071, loot = listOf(5078)),
    BLUE_EGG(item = Items.BIRD_NEST_5072, loot = listOf(5077)),
    SEED(item = Items.BIRD_NEST_5073, loot = listOf(5312, 5283, 5284, 5285, 5286, 5313, 5314, 5288, 5287, 5315, 5289, 5316, 5290, 5317)),
    RING(item = Items.BIRD_NEST_5074, loot = listOf(1635, 1637, 1639, 1641, 1643));

    companion object {
        fun roll(p: Player) = when (p.world.random(1..100)) {
            1 -> RED_EGG.item // 1 / 100
            2 -> GREEN_EGG.item // 1 / 100
            3 -> BLUE_EGG.item // 1 / 100
            in 4..34 -> RING.item// 31 / 100
            else -> SEED.item // 66 / 100
        }

        fun onSearch(nest: Nest, p: Player) {
            p.inventory.add(Items.BIRD_NEST_5075)

            when (nest) {
                RED_EGG -> p.inventory.add(Items.BIRDS_EGG)
                GREEN_EGG -> p.inventory.add(Items.BIRDS_EGG_5078)
                BLUE_EGG -> p.inventory.add(Items.BIRDS_EGG_5077)
                SEED -> {
                    // TODO farming integration
                }
                RING -> {
                    when (p.world.random(1..5)) {
                        1 -> p.inventory.add(Items.GOLD_RING) // FIXME common
                        2 -> p.inventory.add(Items.SAPPHIRE_RING) // FIXME common
                        3 -> p.inventory.add(Items.EMERALD_RING) // FIXME uncommon
                        4 -> p.inventory.add(Items.RUBY_RING) // FIXME rare
                        5 -> p.inventory.add(Items.DIAMOND_RING) // FIXME very rare
                    }
                }
            }
        }
    }
}