package gg.rsmod.plugins.content.skills.woodcutting

enum class Tree(val objects: Set<Int>, val id: Int, val stump: Int, val level: Int, val xp: Double, val chance: Int, val respawn: IntRange) {
    NORMAL(NORMAL_OBJECTS, id = 1511, stump = 1342, level = 1, xp = 25.0, chance = 0, respawn = 15..25),
    ACHEY(ACHEY_OBJECTS, id = 2862, stump = 3371, level = 1, xp = 25.0, chance = 0, respawn = 15..25),
    OAK(OAK_OBJECTS, id = 1521, stump = 1342, level = 15, xp = 37.5, chance = 8, respawn = 15..25),
    WILLOW(WILLOW_OBJECTS, id = 1519, stump = 1342, level = 30, xp = 67.5, chance = 8, respawn = 22..68),
    TEAK(TEAK_OBJECTS, id = 6333, stump = 1342, level = 35, xp = 85.0, chance = 8, respawn = 22..68),
    MAPLE(MAPLE_OBJECTS, id = 1517, stump = 1342, level = 45, xp = 100.0, chance = 8, respawn = 22..68),
    MAHOGANY(MAHOGANY_OBJECTS, id = 6332, stump = 1342, level = 50, xp = 125.0, chance = 8, respawn = 22..68),
    YEW(YEW_OBJECTS, id = 1515, stump = 9714, level = 60, xp = 175.0, chance = 8, respawn = 22..68),
    MAGIC(MAGIC_OBJECTS, id = 1513, stump = 1324, level = 75, xp = 250.0, chance = 8, respawn = 22..68),
    REDWOOD(REDWOOD_OBJECTS, id = 19669, stump = 29669, level = 90, xp = 300.0, chance = 11, respawn = 50..100);
}

// FIXME
private val NORMAL_OBJECTS = hashSetOf(
        1276, 1277, 1278, 1279, 1280, 1282, 1283, 1284, 1285, 1285, 1286, 1289, 1290, 1291, 1315,
        1316, 1318, 1330, 1331, 1332, 1365, 1383, 1384, 2409, 3033, 3034, 3035, 3036, 3881, 3882,
        3883, 5902, 5903, 5904, 10041
)
private val ACHEY_OBJECTS = hashSetOf(2023)
private val OAK_OBJECTS = hashSetOf(9734, 10820)
private val WILLOW_OBJECTS = hashSetOf(10810, 10831)
private val TEAK_OBJECTS = hashSetOf(9036)
private val MAPLE_OBJECTS = hashSetOf(4674, 10832)
private val MAHOGANY_OBJECTS = hashSetOf(9034)
private val YEW_OBJECTS = hashSetOf(1309, 1753, 1754)
private val MAGIC_OBJECTS = hashSetOf(10834)
private val REDWOOD_OBJECTS = hashSetOf(29668, 29670)