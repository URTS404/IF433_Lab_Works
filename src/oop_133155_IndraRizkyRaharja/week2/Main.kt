package oop_133155_IndraRizkyRaharja.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== SISTEM DENDA PERPUSTAKAAN ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val name = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi lama pinjam
    if (duration < 0) {
        println("Warning: Lama pinjam tidak valid, diubah menjadi 1 hari")
        duration = 1
    }

    // Buat objek Loan
    val loan = Loan(title, name, duration)

    // Hitung dan tampilkan denda
    val fine = loan.calculateFine()

    println("\n=== DETAIL PEMINJAMAN ===")
    println("Judul: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp $fine")
}