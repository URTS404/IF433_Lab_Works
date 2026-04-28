package oop_133155_IndraRizkyRaharja.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Dogecoin",    2.500))
    coinRepo.add(Coin("MemeCore",   10.000))
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
}
