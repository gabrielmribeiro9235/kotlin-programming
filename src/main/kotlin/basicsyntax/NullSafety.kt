package org.example.basicsyntax

fun main() {
    // String can not be null
    val neverNull: String = "String that can not be null"
    // String? can be null
    val canBeNull: String? = null
    // If there's no type it, null is not accepted
    val inferredNonNull = "The compiler assumes non-nullable"

    println("neverNull is $neverNull")
    println("canBeNull is $canBeNull")
    println("inferredNonNull is $inferredNonNull")

    // Safe calls
    println("\nSafe calls")
    println("neverNull size: ${neverNull?.length}")
    println("canBeNull size: ${canBeNull?.length}")
    println("inferredNonNull size: ${inferredNonNull?.length}")

    // Elvis operator
    println("\nSafe calls using Elvis operator")
    println("neverNull size: ${neverNull?.length ?: 0}")
    println("canBeNull size: ${canBeNull?.length ?: 0}")
    println("inferredNonNull size: ${inferredNonNull?.length ?: 0}")
}