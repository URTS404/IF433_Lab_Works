package oop_133155_IndraRizkyRaharja.week9

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)