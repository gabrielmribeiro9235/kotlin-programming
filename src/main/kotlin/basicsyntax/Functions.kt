package org.example.basicsyntax

fun hello() {
    println("Hello, World!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun prinMessageWithPrefixWithDefaultValue(message: String, prefix: String = "Log") {
    println("[$prefix] $message")
}

fun sum2(a: Int, b: Int) = a + b

fun main() {
    println("Function hello")
    hello()
    println("Function sum")
    println(sum(1, 2))
    println("Function sum2")
    println(sum2(1, 2))
    println("Function printMessageWithPrefix")
    printMessageWithPrefix("Hello, World!", "Info")
    println("Function printMessageWithPrefixWithDefaultValue")
    prinMessageWithPrefixWithDefaultValue("Hello, World!")

    val uppercaseString = { text: String -> text.uppercase() }
    println("Lambda expression uppercaseString")
    println(uppercaseString("Hello, World!"))

    val numbers = (-5..5).toList()
    println("Numbers: $numbers")

    val isPositive = { x: Int -> x > 0 }
    val isNegative = {x: Int -> x < 0 }

    val positives = numbers.filter(isPositive)
    val negatives = numbers.filter(isNegative)
    val evens = numbers.filter({ x -> x % 2 == 0 })

    println("Positives: $positives")
    println("Negatives: $negatives")
    println("Evens: $evens")
}