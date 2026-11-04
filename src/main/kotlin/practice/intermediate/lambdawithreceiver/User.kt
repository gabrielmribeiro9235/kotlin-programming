package org.example.practice.intermediate.lambdawithreceiver

class User(
    val name: String,
    val email: String
) {
    fun sendEmail() {
        println("Sending email")
    }

    fun authenticate() {
        println("Authenticating user")
    }

    fun connecting() {
        println("Connecting user")
    }

    override fun toString(): String {
        return "User(name='$name', email='$email')"
    }
}