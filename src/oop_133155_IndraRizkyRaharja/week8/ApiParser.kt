package oop_133155_IndraRizkyRaharja.week8

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // TODO: Ekstrak 'id' dari rawJson menggunakan requireNotNull
        //       Ganti pesan error sesuai kebutuhanmu
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID" // TODO: Boleh ganti pesan error ini
        }

        // TODO: Ekstrak 'name' dari rawJson menggunakan requireNotNull
        //       Ganti pesan error sesuai kebutuhanmu
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name" // TODO: Boleh ganti pesan error ini
        }

        // TODO: Ekstrak 'type' sebagai String (boleh null jika tidak ada)
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // TODO: Ekstrak 'warranty' dengan as? Int, fallback Elvis ?: 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                // TODO: Ekstrak 'size' dengan as? String, fallback Elvis ?: "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }

            else -> null // Tipe tidak dikenal atau null -> return null
        }
    }

    fun checkout(product: Product) {
        // TODO: Ekstrak id dari product menggunakan when (karena sealed class)
        val productId = when (product) {
            is Electronic -> product.id // TODO: id dari Electronic
            is Clothing   -> product.id // TODO: id dari Clothing
        }

        // TODO: Lempar productId ke JavaPaymentService.processPayment()
        //       Gunakan !! karena kita yakin Java service selalu mengembalikan Transaction ID
        val transactionId = JavaPaymentService.processPayment(productId)!!

        // TODO: Print Transaction ID hasil pembayaran
        println("Pembayaran berhasil! Transaction ID: $transactionId")
    }
}
