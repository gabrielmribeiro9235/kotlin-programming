package org.example.practice.intermediate.extensionfunctions

fun HttpClientSimulation.get(url: String) = request("GET", url, emptyMap())
fun HttpClientSimulation.post(url: String) = request("POST", url, emptyMap())

fun main() {
    println("Starting client")
    val client = HttpClientSimulation()

    println("Making a get request")
    client.get("http://localhost/8080")

    println("Making a post request")
    client.post("http://localhost/8080")
}