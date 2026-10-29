package org.example.basicsyntax

fun main() {
    println("Lists:")
    // Read-only list
    val readOnlyList: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(readOnlyList)

    // Mutable list
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(mutableList)

    // Basic functions and operations
    println("First element of the read-only list is ${readOnlyList.first()}")
    println("First element of the mutable list is ${mutableList.first()}")

    println("Last element of the read-only list is ${readOnlyList.last()}")
    println("Last element of the mutable list is ${mutableList.last()}")

    println("The read-only list has ${readOnlyList.count()} items")
    println("The mutable list has ${readOnlyList.count()} items")

    println("Is 11 in the read-only list? ${if (11 in readOnlyList) "Yes" else "No"}")
    println("Is 11 in the mutable list? ${if (11 in mutableList) "Yes" else "No"}")

    mutableList.add(11)
    println("11 added to the mutable list")
    println(mutableList)

    mutableList.remove(11)
    println("11 removed from the mutable list")
    println(mutableList)

    println("Second element of the read-only list is ${readOnlyList[1]}")
    println("Second element of the mutable list is ${mutableList[1]}")

    println("\nSets:")
    // Read-only set
    val readOnlySet: Set<Int> = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10)
    println(readOnlySet)

    // Mutable set
    val mutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10)
    println(mutableSet)

    // Basic functions and operations
    println("The read-only set has ${readOnlySet.count()} items")
    println("The mutable set has ${mutableSet.count()} items")

    println("Is 11 in the read-only set? ${if (11 in readOnlySet) "Yes" else "No"}")
    println("Is 11 in the mutable set? ${if (11 in mutableSet) "Yes" else "No"}")

    mutableSet.add(11)
    println("11 added to the mutable set")
    println(mutableSet)

    mutableSet.remove(11)
    println("11 removed from the mutable set")
    println(mutableSet)

    println("\nMaps:")
    // Read-only map
    val readOnlyMap: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(readOnlyMap)

    // Mutable map
    val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(mutableMap)

    // Basic functions and operations
    println("Value of one in the read-only map is ${readOnlyMap["one"]}")
    println("Value of one in the mutable map is ${mutableMap["one"]}")

    mutableMap["five"] = 5
    println("Five added to the mutable map")
    println(mutableMap)

    mutableMap.remove("five")
    println("Five removed from the mutable map")
    println(mutableMap)

    println("The read-only map has ${readOnlyMap.count()} key-value pairs")
    println("The mutable map has ${mutableMap.count()} key-value pairs")

    println("Is the key five in the read-only map? ${if (mutableMap.containsKey("five")) "Yes" else "No"}")
    println("Is the key five in the mutable map? ${if (mutableMap.containsKey("five")) "Yes" else "No"}")

    println("Keys of the read-only map")
    println(readOnlyMap.keys)

    println("Keys of the mutable map")
    println(mutableMap.keys)

    println("Values of the read-only map")
    println(readOnlyMap.values)

    println("Values of the mutable map")
    println(mutableMap.values)
}