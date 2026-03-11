package oop_133155_IndraRizkyRaharja.week6

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    println("\n=== SMART HOME SYSTEM ===")
    val lamp = SmartLamp(id = "Lampu_001", name = "Kamar Tidur")
    val speaker = SmartSpeaker(id = "Speaker_001", name = "Ruang Tamu")
    val cctv = SmartCCTV(id = "KameraRumah_001", name = "Garasi Rumah")
}