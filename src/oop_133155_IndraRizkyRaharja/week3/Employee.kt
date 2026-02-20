package oop_133155_IndraRizkyRaharja.week3

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    val tax: Double
        get() = salary * 0.1

    private var performanceRating: Int = 3

    fun increasePerformanceRating() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}