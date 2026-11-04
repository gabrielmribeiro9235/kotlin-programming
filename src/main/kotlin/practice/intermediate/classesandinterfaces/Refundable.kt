package org.example.practice.intermediate.classesandinterfaces

interface Refundable {
    val refundLimit: Double
    fun refund(amount: Double): Boolean
}