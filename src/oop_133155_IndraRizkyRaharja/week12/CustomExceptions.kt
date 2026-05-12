package oop_133155_IndraRizkyRaharja.week12

// Custom exception dengan membawa data tambahan
class InsufficientFundsException(
    val amount : Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")