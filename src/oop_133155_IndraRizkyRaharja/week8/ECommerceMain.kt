package oop_133155_IndraRizkyRaharja.week8

fun main() {
    // TODO: Data kotor dari API (jangan diubah isinya, sesuai soal)
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),  // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    // TODO: Instansiasi ApiParser
    val parser = ApiParser()

    // TODO: Iterasi setiap item di rawApiData
    for (raw in rawApiData) {
        try {
            // TODO: Panggil parseProduct(raw), tangkap IllegalArgumentException jika ada
            val product = parser.parseProduct(raw)

            // TODO: Jika product tidak null, panggil checkout()
            //       Gunakan ?.let agar hanya dieksekusi jika tidak null
            product?.let {
                parser.checkout(it)
            } ?: println("SKIP: Tipe produk tidak dikenal untuk data -> $raw")

        } catch (e: IllegalArgumentException) {
            // TODO: Cetak peringatan log jika data korup (ID atau Name hilang)
            println("WARN: Data korup diabaikan. Alasan: ${e.message}")
        }
    }
}