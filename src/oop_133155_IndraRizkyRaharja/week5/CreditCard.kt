package oop_133155_IndraRizkyRaharja.week5

class CreditCard(
    accountName: String,
    val limit: Double  // Batas maksimum kredit
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0  // Jumlah yang sudah digunakan

    override fun processPayment(amount: Double) {
        println("[$accountName] mencoba membayar Rp. $amount menggunakan Credit Card")

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            val sisaLimit = limit - usedAmount
            println("Pembayaran BERHASIL! Sisa limit: Rp. $sisaLimit")
        } else {
            val kelebihan = (usedAmount + amount) - limit
            println("Pembayaran DITOLAK! Melebihi limit sebesar Rp. $kelebihan")
            println("Limit: Rp. $limit, Sudah digunakan: Rp. $usedAmount")
        }
    }

    fun getRemainingLimit(): Double {
        return limit - usedAmount
    }
}