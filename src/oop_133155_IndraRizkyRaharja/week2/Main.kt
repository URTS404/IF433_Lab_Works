package oop_133155_IndraRizkyRaharja.week2

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== RPG BATTLE GAME ===")

    // Input nama hero
    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Damage Hero: ")
    val heroDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, heroDamage)

    // Input enemy
    var enemyHp = 100

    println("\n=== PERTEMPURAN DIMULAI ===")
    println("$heroName vs Monster")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            // Serangan hero
            hero.attack("Monster")
            enemyHp -= hero.baseDamage
            println("Monster HP: ${if (enemyHp > 0) enemyHp else 0}")

            // Serangan Monster
            if (enemyHp > 0) {
                val enemyDamage = Random.nextInt(10, 21)
                hero.takeDamage(enemyDamage)
                println("Monster menyerang balik!")
                println("$heroName HP: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("$heroName kabur!")
            break
        }
    }

    // Hasil
    println("\n=== HASIL ===")
    if (!hero.isAlive()) {
        println("Hero kalah!")
    } else if (enemyHp <= 0) {
        println("Hero menang!")
    } else {
        println("Hero kabur!")
    }

    scanner.close()
}