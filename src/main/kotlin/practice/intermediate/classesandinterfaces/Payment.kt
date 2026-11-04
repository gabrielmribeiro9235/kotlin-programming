package org.example.practice.intermediate.classesandinterfaces

abstract class Payment(val amount: Double) {
    abstract fun process(): String

    fun printReceipt() {
        println("Receipt: $amount")
        println(process())
    }
}