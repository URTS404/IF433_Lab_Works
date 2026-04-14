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

    println()
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("[BLACKSMITH] Senjata diupgrade! Damage baru: ${upgradedItem.damage}")

    println()
    println("=== SIMULASI BATTLE EVENT ===")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Hijau Tambang"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena keracunan MBG"))
}