package oop_133155_IndraRizkyRaharja.week4

// Parent class Employee (harus open)
open class Employee(
    val name: String,
    val baseSalary: Int
) {

    // Method open fun work()
    open fun work() {
        println("$name sedang bekerja.")
    }

    // Method open fun calculateBonus() mengembalikan 10% dari baseSalary
    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
}