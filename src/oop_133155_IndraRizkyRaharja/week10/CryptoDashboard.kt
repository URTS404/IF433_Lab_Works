package oop_133155_IndraRizkyRaharja.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Dogecoin",    2.500))
    coinRepo.add(Coin("MemeCore",   10.000))
    coinRepo.add(Coin("wojak",       4000.0))
}
