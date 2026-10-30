package org.example.basicsyntax

fun main() {
    /**CONDITIONAL EXPRESSIONS*/
    // if-else statement
    val variable: String = "Hello"

    if (variable == "Hello") {
        println("The value of variable is Hello")
    } else {
        println("The value of variable is not Hello")
    }

    // There's no ternary operator in Kotlin.
    // To do something like ternaries
    // use an if as an expression (inline)
    println(if (variable == "Hello") "The value of variable is Hello" else "The value of variable is not Hello")

    // when statement
    when (variable) {
        "Hello" -> println("The value is Hello")
        "World" -> println("The value is World")
        else -> println("The value is not Hello or World")
    }

    // it also can be used as an expression
    println(when (variable) {
        "Hello" -> "The value is Hello"
        "World" -> "The value is World"
        else -> "The value is not Hello or World"
    })

    /**LOOPS*/
    // for statement
    val names: List<String> = listOf("Mary", "Jane", "John", "Denise", "Antony")

    println("Iterating from 1 to 10")
    for (x in 1..10) {
        print("$x ")
    }

    println("\nEven numbers from 1 to 10")
    for (x in 2..10 step 2) {
        print("$x ")
    }

    println("\nIterating from 10 to 1")
    for (x in 10 downTo 1) {
        print("$x ")
    }

    println("\nIterating through the list of names")
    for (name in names) {
        println(name)
    }

    // while and do-while statement
    var namesPrinted: Int = 0

    while (namesPrinted != 0) {
        println("Trying to print something in the while")
    }

    do {
        println("Trying to print something in the do-while")
    } while (namesPrinted != 0)

    println("Printing names using while:")
    while (namesPrinted < names.count()) {
        println(names[namesPrinted])
        namesPrinted++
    }

    namesPrinted = 0
    println("Printing names using do-while:")
    do {
        println(names[namesPrinted])
        namesPrinted++
    } while (namesPrinted < names.count())
}