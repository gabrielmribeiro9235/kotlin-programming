package org.example.practice.intermediate.scopefunctions

val clients: List<Client?> = listOf(
    Client().apply {
        setName("Name1")
        setToken("token1")
    },
    Client().apply {
        setName("Name2")
        setToken("token2")
    },
    Client().apply {
        setName("Name3")
        setToken("token3")
    },
    null
)

val datas: List<String?> = clients.map {
    it?.run {
        connect()
        authenticate()
        getData()
    }
}

fun getClientToken(client: Client): String {
    return client.token
}

fun main() {
    val index = (0..3).random()

    val client = clients[index]
    val data = datas[index]

    println("\nClient selected:")
    println(client ?: "client does not exist")

    println("Data:")
    println(data ?: "client does not exist")

    val clientToken = client?.let { getClientToken(it) }
    println("Client token:")
    println(clientToken ?: "client does not exist")

    println("\nRemoving null values of the clients list")
    print("Current clients list: ")
    val nonNullClients = clients.also { println(it) }.filterNotNull()
    println("Non-null clients list: $nonNullClients")

    client?.let {
        with(it) {
            println("\nUsing 'with' to call a lot of member functions")
            setToken("new token")
            setName("new name")
            authenticate()
            connect()
            getData()
            println(toString())
            println("Client token: ${getClientToken(this)}")
        }
    }
}