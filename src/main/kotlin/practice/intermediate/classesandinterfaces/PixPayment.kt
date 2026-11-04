package org.example.practice.intermediate.classesandinterfaces

class PixPayment(amount: Double): Payment(amount) {
    override fun process() = "Processing Pix payment of $amount"
}