package oop_133155_IndraRizkyRaharja.week5

class EWallet(
    accountName: String,
    var balance: Double  // Saldo yang tersedia di dompet
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        println("[$accountName] mencoba membayar Rp. $amount menggunakan E-Wallet")

        if (balance >= amount) {
            balance -= amount
            println("Pembayaran BERHASIL! Sisa saldo: Rp. $balance")
        } else {
            println("Pembayaran GAGAL! Saldo tidak cukup (Saldo: Rp. $balance)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top-up sebesar Rp. $amount berhasil. Saldo sekarang: Rp. $balance")
    }
}