package org.example.practice.intermediate.lambdawithreceiver

fun signUp(name: String, email: String, block: User.() -> Unit): User {
    val user = User(name, email)
    user.block()
    return user
}
