package org.example.practice.intermediate.classesandinterfaces

fun main() {
    val payments: List<Payment> = listOf(
        CreditCardPayment(300.0),
        PixPayment(150.0)
    )

    for (payment in payments) {
        payment.printReceipt()
        if (payment is Refundable) {
            println("Refund of 400.0 approved: ${payment.refund(400.0)}")
        }
    }
}
