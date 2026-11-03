package org.example.practice.intermediate.extensionfunctions

class HttpClientSimulation {
    fun request(method: String, url: String, headers: Map<String, String>) {
        println("Requesting $method to $url with headers: $headers")
    }
}
