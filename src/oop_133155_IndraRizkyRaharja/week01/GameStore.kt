package oop_133155_IndraRizkyRaharja.week01

fun main() {
    // Persiapan Data
    val gameTitle = "Elden Ring: Shadow of the Erdtree"
    val price = 750000

    // Null Safety Challenge
    val userNote: String? = null

    // Perhitungan diskon
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    // Cetak struk dengan named arguments
    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        userNote = userNote
    )
}

// Logika Diskon (Expression Body)
fun calculateDiscount(price: Int): Int {
    return if (price > 500000) {
        (price * 0.2).toInt()
    } else {
        (price * 0.1).toInt()
    }
}

// Cetak Struk (Named Arguments) dan Cetak Struk dengan Null Safety
fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    userNote: String?
) {
    println("=".repeat(40))
    println("            STEAMKW STORE")
    println("=".repeat(40))
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")
    println("-".repeat(40))

    // Elvis Operator untuk null safety
    val noteToPrint = userNote ?: "Tidak ada catatan"
    println("Catatan     : $noteToPrint")

    println("=".repeat(40))
    println("Terima kasih telah berbelanja!")
}