package oop_133155_IndraRizkyRaharja.week7

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("[SAFE ZONE] Kamu berada di zona aman. Tidak ada ancaman.")
        }
        is BattleState.MonsterEncounter -> {
            println("[ENCOUNTER] Monster muncul: ${event.monsterName}! Bersiaplah bertarung!")
        }
        is BattleState.LootDropped -> {
            println("[LOOT] Item ditemukan: ${event.item.name}")
            println("       Damage : ${event.item.damage}")
            println("       Rarity : ${event.item.rarity} (Drop Chance: ${event.item.rarity.dropChance}%)")
        }
        is BattleState.GameOver -> {
            println("[GAME OVER] Permainan berakhir. Alasan: ${event.reason}")
        }
    }
}