package oop_133155_IndraRizkyRaharja.week4

fun main() {
    println("--- Testing Employee Hierarchy ---")

    val manager = Manager(name = "Ucup", baseSalary = 10000000)
    val developer = Developer(name = "Ana", baseSalary = 8000000, programmingLanguage = "Kotlin")

    println("\nManager:")
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\nDeveloper:")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}