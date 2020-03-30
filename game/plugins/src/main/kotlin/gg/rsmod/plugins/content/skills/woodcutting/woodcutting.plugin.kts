package gg.rsmod.plugins.content.skills.woodcutting

Tree.values().forEach {type ->
    type.objects.forEach { tree ->
        on_obj_option(obj = tree, option = 1) {
            val obj = player.getInteractingGameObj()

            player.queue { Woodcutting.chop(this, obj, type) }
        }
    }
}
