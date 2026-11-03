package org.example.practice.intermediate.scopefunctions

class Client {
    var name: String = ""
        private set

    var token: String = ""
        private set

    fun setToken(token: String) {
        this.token = token
    }

    fun setName(name: String) {
        this.name = name
    }

    fun connect() = println("Connected!")

    fun authenticate() = println("Authenticated!")

    fun getData(): String {
        println("Getting data!")
        return "Mock data"
    }

    override fun toString(): String {
        return "Client(name='$name')"
    }
}