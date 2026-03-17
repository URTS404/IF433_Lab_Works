package oop_133155_IndraRizkyRaharja.week7

enum class ItemRarity(val dropChance: Int) {
    COMMON(90),
    UNCOMMON(50),
    RARE(20),
    EPIC(10),
    LEGENDARY(5)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)