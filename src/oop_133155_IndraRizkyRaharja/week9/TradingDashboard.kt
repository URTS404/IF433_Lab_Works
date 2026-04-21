package oop_133155_IndraRizkyRaharja.week9

fun main() {
    val tradeHistory = listOf(
        TradeLog(pair = "Dogecoin", position = "LONG", leverage = 20, roe = 16.3, status = "OPEN"),
        TradeLog(pair = "Bonk", position = "SHORT", leverage = 10, roe = -3.8, status = "CLOSED"),
        TradeLog(pair = "Dogecoin", position = "SHORT", leverage = 15, roe = 12.0, status = "OPEN"),
        TradeLog(pair = "Popcat", position = "LONG", leverage = 10, roe = 19.2, status = "OPEN"),
        TradeLog(pair = "Bonk", position = "LONG", leverage = 5, roe = -1.1, status = "CLOSED"),
        TradeLog(pair = "Dogecoin", position = "LONG", leverage = 20, roe = -20.0, status = "OPEN"),
        TradeLog(pair = "Popcat", position = "SHORT", leverage = 10, roe = 21.5, status = "CLOSED")
    )

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
    val winningTrades = closedTrades
        .filter { it.roe > 0 }
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
    println("=".repeat(40))
    println("=== CRYPTO TRADING DASHBOARD ===")
    println("=".repeat(40))
    println("\n--- TOP PERFORMERS (PROFIT) ---")
    topPerformersString.forEach { println(it) }
}