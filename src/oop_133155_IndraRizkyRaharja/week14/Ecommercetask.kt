package oop_133155_IndraRizkyRaharja.week14
import java.io.File

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), Melakukan + I/O + Notifikasi sekali
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        // VIOLATION OCP: kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP"     -> basePrice * 0.90  // Diskon 10%
            else      -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(
    private val filePath: String = "orders.csv"
) : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File(filePath).printWriter().use { writer ->
            writer.println("$itemName,$finalPrice,$customerType")
        }
        println("(LOG) Order disimpan ke $filePath")
    }
}

interface NotificationService {
    fun sendNotification(itemName: String, customerType: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String, customerType: String) {
        println("Email terkirim ke pelanggan [$customerType]: Pesanan '$itemName' telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    private val repo    : OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricing: PricingStrategy) {
        val finalPrice = pricing.calculate(basePrice)
        println("Memproses pesanan '$itemName' seharga $$finalPrice")
        repo.saveOrder(itemName, finalPrice, pricing.javaClass.simpleName)
        notifier.sendNotification(itemName, pricing.javaClass.simpleName)
    }
}