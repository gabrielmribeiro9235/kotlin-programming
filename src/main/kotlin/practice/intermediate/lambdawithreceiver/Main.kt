package org.example.practice.intermediate.lambdawithreceiver

fun main() {
    val name = "Johnny B. Goode"
    val email = "johnnybg@gmail.com"

    val userJohnny = signUp(name, email) {
        sendEmail()
        authenticate()
        connecting()
    }

    println("\nLogged user: $userJohnny")
}
