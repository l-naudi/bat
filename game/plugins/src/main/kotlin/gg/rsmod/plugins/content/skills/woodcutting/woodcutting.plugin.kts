package gg.rsmod.plugins.content.skills.woodcutting

Tree.values().forEach { type ->
    type.objects.forEach { tree ->
        on_obj_option(obj = tree, option = 1) {
            player.queue { Woodcutting.chop(this, player.getInteractingGameObj(), type) }
        }
    }
}

Nest.values().forEach {
    on_item_option(item = it.item, option = "Search") {
        val slot = player.getInteractingItemSlot()

        if (!player.inventory.isFull) {
            if (player.inventory.remove(item = it.item, beginSlot = slot).hasSucceeded()) {
                Nest.onSearch(it, player)
            }
        }
    }
}

// Woodcutting guild -- rope ladder
on_obj_option(obj = 28857, option = "Climb-up") {
    val ladder = player.getInteractingGameObj()

    player.queue {
        player.animate(828)
        this.wait(2)

        if (ladder.tile.x == 1566) { // western-most ladders
            player.moveTo(ladder.tile.transform(1, 0,1))
        } else {
            player.moveTo(ladder.tile.transform(-1, 0,1))
        }
    }
}

// Woodcutting guild -- rope ladder
on_obj_option(obj = 28858, option = "Climb-down") {
    val ladder = player.getInteractingGameObj()

    player.queue {
        player.animate(828)
        this.wait(2)

        player.moveTo(ladder.tile.transform(-1))
    }
}