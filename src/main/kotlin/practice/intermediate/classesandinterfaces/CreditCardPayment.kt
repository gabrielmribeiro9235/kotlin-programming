package org.example.practice.intermediate.classesandinterfaces

class CreditCardPayment(amount: Double): Payment(amount), Refundable {
    override val refundLimit = 500.0

    override fun refund(amount: Double) = amount <= refundLimit

    override fun process() = "Processing credit card payment of $amount"
}
