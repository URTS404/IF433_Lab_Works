package oop_133155_IndraRizkyRaharja.week3

class Employee(val name: String) {

    val tax: Double
        get() = salary * 0.1
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value // Gunakan field untuk assign nilai asli
            }
        }

    // Hanya bisa di akses di file/class ini saja
    private var performanceRating: Int = 3

    fun increasePerformanceRating() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    // Kita tidak buat getter untuk performanceRating, jadi data ini benar-benar rahasia
    // Kecuali kita buat function khusus untuk print.
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}