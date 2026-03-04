package oop_133155_IndraRizkyRaharja.week5

fun main() {
    println("=== SISTEM PEMBAYARAN E-COMMERCE ===")
    println("PART 4: Implementasi Dasar\n")

    // 1. Membuat objek EWallet dan CreditCard
    val eWallet = EWallet(
        accountName = "Indra Rizky Raharja",
        balance = 100000.0
    )

    val creditCard = CreditCard(
        accountName = "Indra Rizky Raharja",
        limit = 5000000.0
    )

    // 2. Memasukkan ke dalam list bertipe PaymentMethod (Polymorphism)
    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    // 3. Informasi awal
    println("Saldo E-Wallet: Rp. ${eWallet.balance}")
    println("Limit Credit Card: Rp. ${creditCard.limit}")
    println("-".repeat(60))

    // 4. Perulangan untuk memproses pembayaran
    val jumlahPembayaran = 120000.0
    println("Memproses pembayaran Rp. $jumlahPembayaran dengan semua metode...\n")

    for (metode in daftarPembayaran) {
        // Polymorphism: method yang dipanggil tergantung tipe objek asli
        metode.processPayment(jumlahPembayaran)
        println("-".repeat(40))
    }

    println("\nRekapanUang:")
    println("Saldo E-Wallet: Rp. ${eWallet.balance}")
    println("Credit Card - Used: Rp. ${creditCard.usedAmount}, Remaining: Rp. ${creditCard.getRemainingLimit()}")
}