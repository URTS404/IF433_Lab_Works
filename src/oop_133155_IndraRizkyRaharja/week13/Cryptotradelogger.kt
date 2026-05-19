package oop_133155_IndraRizkyRaharja.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id    : Int,
    val symbol: String,
    val type  : String,
    val margin: Double,
    val pnl   : Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
    println("${trades.size} trade berhasil disimpan ke $path")
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines()
            .mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File $path tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(
            id = 1,
            symbol = "Dogecoin",
            type = "Long",
            margin = 100.0,
            pnl = 25.5
        ),
        TradeRecord(
            id = 2,
            symbol = "MemeCore",
            type = "Short",
            margin = 50.0,
            pnl = -10.0
        ),
        TradeRecord(
            id = 3,
            symbol = "wojak",
            type = "Long",
            margin = 75.0,
            pnl = 40.0
        )
    )
    val csvPath = "crypto_trades.csv"
    saveTrades(trades, path = csvPath)

    File(csvPath).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println("Baris data korup berhasil disuntikkan ke $csvPath untuk pengujian.")

    println("\n=== MEMUAT DATA TRADE ===")
    val loadedData = loadTrades(path = csvPath)
    val totalPnl = loadedData.sumOf { it.pnl }
}