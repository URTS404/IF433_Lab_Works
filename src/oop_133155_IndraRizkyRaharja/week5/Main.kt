package oop_133155_IndraRizkyRaharja.week5

fun main() {
    println("=== SISTEM PEMBAYARAN E-COMMERCE ===")

    // 1. Membuat objek EWallet dan CreditCard
    val eWallet = EWallet(
        accountName = "Indra Rizky",
        balance = 100000.0
    )

    val creditCard = CreditCard(
        accountName = "Indra Rizky",
        limit = 5000000.0
    )

    // 2. Memasukkan ke dalam list bertipe PaymentMethod (Polymorphism)
    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    // 3. Informasi awal
    println("Saldo E-Wallet: Rp. ${eWallet.balance}")
    println("Limit Credit Card: Rp. ${creditCard.limit}")
    println("-".repeat(60))

    // 4. Perulangan dengan Smart Casting
    val jumlahPembayaran = 150000.0
    println("Memproses pembayaran Rp. $jumlahPembayaran dengan semua metode...\n")

    for (metode in daftarPembayaran) {
        // Polymorphism: method yang dipanggil tergantung tipe objek asli
        metode.processPayment(jumlahPembayaran)

        // SMART CASTING CHALLENGE: Mendeteksi tipe dengan operator 'is'
        when (metode) {
            is EWallet -> {
                println("Terdeteksi sebagai E-Wallet! Melakukan top-up otomatis...")

                // Smart casting! Kita bisa akses fungsi topUp() langsung
                metode.topUp(50000.0)

                println("Mencoba pembayaran lagi setelah top-up...")
                metode.processPayment(jumlahPembayaran)
            }
            is CreditCard -> {
                println("Terdeteksi sebagai Credit Card. Sisa limit: Rp. ${metode.getRemainingLimit()}")
                // Tidak ada top-up untuk credit card, hanya informasi
            }
        }
        println("-".repeat(50))
    }

    // 5. Informasi akhir
    println("\nRecapanKeunagan:")
    println("Saldo E-Wallet: Rp. ${eWallet.balance}")
    println("Credit Card - Used: Rp. ${creditCard.usedAmount}, Remaining: Rp. ${creditCard.getRemainingLimit()}")

    // 6. Verifikasi bahwa smart casting bekerja
    println("\nVERIFIKASI SMART CASTING:")
    println("• Baris 'metode.topUp(50000.0)' bisa dipanggil karena smart casting")
    println("• Kotlin secara otomatis meng-cast 'metode' menjadi tipe EWallet di dalam blok is")
    println("• Tanpa smart casting, kita harus manual casting: (metode as EWallet).topUp()")
}