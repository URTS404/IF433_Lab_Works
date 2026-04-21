package oop_133155_IndraRizkyRaharja.week9

data class TradeLog(
    val pair: String,       // TODO: Pasangan koin, contoh: "BTCUSDT", "ETHUSDT"
    val position: String,   // TODO: Posisi trading, contoh: "LONG" atau "SHORT"
    val leverage: Int,      // TODO: Leverage yang digunakan, contoh: 10, 20
    val roe: Double,        // TODO: Return on Equity dalam %, positif = profit, negatif = loss
    val status: String      // TODO: Status trade, hanya "OPEN" atau "CLOSED"
)