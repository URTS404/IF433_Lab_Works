package oop_133155_IndraRizkyRaharja.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Dogecoin", 2500.0))
    coinRepo.add(Coin("MemeCore",   1000.0))
    coinRepo.add(Coin("wojak",       4000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("========================================")
    println("       CRYPTO WALLET DASHBOARD          ")
    println("========================================")
    println("Status Response : ${response.status}")
    println("Jumlah Koin     : ${coinRepo.count()}")
    println("----------------------------------------")
    println("Daftar Koin:")

    response.data.forEach { coin ->
        println("  • ${coin.name.padEnd(10)} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TF-001", 500.0))
    txRepo.add(Transaction("TF-002", 120.75))
    txRepo.add(Transaction("TF-003", 300.0))

    println("========================================")
    println("         RIWAYAT TRANSAKSI              ")
    println("========================================")

    val txResponse = ApiResponse("200 OK", txRepo.getAll())
    println("Status Response   : ${txResponse.status}")
    println("Jumlah Transaksi  : ${txRepo.count()}")
    println("----------------------------------------")

    txResponse.data.forEach { tx ->
        println("  [${tx.id}] Amount: $${tx.amount}")
    }

    println("========================================")
    println("              SUMMARY                   ")
    println("========================================")
    val totalBalance = coinRepo.getAll().sumOf { it.balance }
    val totalTx      = txRepo.getAll().sumOf { it.amount }
    println("Total Balance Semua Koin : $totalBalance")
    println("Total Nilai Transaksi    : $$totalTx")
    println("========================================")
    println("Sisa Balance Koin Setelah Transaksi:")
    val jumlahKoin      = coinRepo.count()
    val potonganPerKoin = if (jumlahKoin > 0) totalTx / jumlahKoin else 0.0
    coinRepo.getAll().forEach { coin ->
        val sisaBalance = coin.balance - potonganPerKoin
        println("  • ${coin.name.padEnd(10)} | Sebelum: ${coin.balance.toString().padEnd(8)} → Sesudah: $sisaBalance")
    }
    println("========================================")
}
