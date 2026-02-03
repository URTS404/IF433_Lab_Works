package oop_133155_IndraRizkyRaharja.week01

fun main() {
    // Persiapan Data
    val gameTitle = "Elden Ring: Shadow of the Erdtree"
    val price = 750000

    // Perhitungan diskon
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    println("Game: $gameTitle")
    println("Harga Asli: Rp $price")
    println("Diskon: Rp $discount")
    println("Harga Akhir: Rp $finalPrice")
}

// Logika Diskon (Expression Body)
fun calculateDiscount(price: Int): Int {
    return if (price > 500000) {
        (price * 0.2).toInt()
    } else {
        (price * 0.1).toInt()
    }
}