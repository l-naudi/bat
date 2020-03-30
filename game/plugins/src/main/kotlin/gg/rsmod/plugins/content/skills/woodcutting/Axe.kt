package gg.rsmod.plugins.content.skills.woodcutting

import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.Skills
import gg.rsmod.plugins.api.cfg.Items

enum class Axe(val item: Int, val level: Int, val animation: Int) {
    BRONZE(item = Items.BRONZE_AXE, level = 1, animation = 879),
    IRON(item = Items.IRON_AXE, level = 1, animation = 877),
    STEEL(item = Items.STEEL_AXE, level = 6, animation = 880),
    BLACK(item = Items.BLACK_AXE, level = 11, animation = 878),
    MITHRIL(item = Items.MITHRIL_AXE, level = 21, animation = 871),
    ADAMANT(item = Items.ADAMANT_AXE, level = 31, animation = 874),
    RUNE(item = Items.RUNE_AXE, level = 41, animation = 867),
    GILDED(item = Items.GILDED_AXE, level = 41, animation = 867),
    DRAGON(item = Items.DRAGON_AXE, level = 61, animation = 870),
    THIRD_AGE(item = Items._3RD_AGE_AXE, level = 61, animation = 2846),
    INFERNAL(item = Items.INFERNAL_AXE, level = 61, animation = 2117); // TODO charges, chance to burn logs

    companion object {
        fun bestFor(p: Player): Axe? {
            return values().asSequence()
                    .filter { it.level <= p.getSkills().getMaxLevel(Skills.WOODCUTTING) }
                    .filter { p.equipment.contains(it.item) || p.inventory.contains(it.item) }
                    .lastOrNull()
        }
    }
}