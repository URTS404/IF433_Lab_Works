package oop_133155_IndraRizkyRaharja.week01

fun main() {
    //REFACTOR: Gunakan val dan hapus tipe data eksplisit
    var name: String = "IndraRizkyRaharja"
    var score: Int = 100

    // REFACTOR: String Template ($name)
    println("Nama: $name, Nilai: $score")
    // Tambahkan di bawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade Kamu: $grade")
    // Panggil DI DALAM MAIN()
    println("Status: ${calculateStatus(score)}")
}

// Tulis DI LUAR MAIN()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"