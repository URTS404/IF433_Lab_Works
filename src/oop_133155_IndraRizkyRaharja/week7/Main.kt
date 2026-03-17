package oop_133155_IndraRizkyRaharja.week7

fun main() {
    GameManager.startGame()
    GameManager.startGame()
    println()

    println("[ENUM] Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("[FORGE] Senjata awal ditempa:")
    println("        Nama      : ${starterWeapon.item.name}")
    println("        Damage    : ${starterWeapon.item.damage}")
    println("        Rarity    : ${starterWeapon.item.rarity}")
    println("        Durability: ${starterWeapon.durability}")
}

