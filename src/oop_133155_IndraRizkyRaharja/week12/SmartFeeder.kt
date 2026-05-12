package oop_133155_IndraRizkyRaharja.week12

fun dispenseKibble(
    requestedGram : Int,
    availableGram : Int,
    isJammed      : Boolean
): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
    }
}

fun main() {
    var currentKibbleStock = 50
    println("========================================")
    println("      SMART PET FEEDER SYSTEM           ")
    println("========================================")
    println("Stok kibble awal : $currentKibbleStock gr")
    println("----------------------------------------")

    println("\n[JADWAL MAKAN 1 - PAGI]")
    try {
        val sisa = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed      = false
        )
        currentKibbleStock = sisa
        println("Stok setelah makan pagi: $currentKibbleStock gr")

    } catch (e: DispenserJamException) {
        println("ERROR HARDWARE  : ${e.message}")
        println("Tindakan        : Periksa dan bersihkan dispenser secara manual.")

    } catch (e: FoodEmptyException) {
        println("ERROR STOK      : ${e.message}")
        println("Tindakan        : Segera isi ulang wadah kibble.")

    } catch (e: IllegalArgumentException) {
        println("ERROR INPUT     : ${e.message}")

    } catch (e: Exception) {
        println("ERROR TAK TERDUGA: ${e.message}")

    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n[JADWAL MAKAN 2 - SORE]")
    val stockAfterRefill = 1000
    println("Kibble diisi ulang. Stok baru: $stockAfterRefill gr")

    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = stockAfterRefill,
            isJammed      = false
        )
    }
}