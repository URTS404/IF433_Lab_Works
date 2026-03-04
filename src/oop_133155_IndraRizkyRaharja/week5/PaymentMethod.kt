package oop_133155_IndraRizkyRaharja.week5

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}