package org.example.basicsyntax

fun main() {
    // from -128 to 127
    val a: Byte = 127
    println(a)
    // from -32.768 to 32.767
    val b: Short = 32_767
    println(b)
    // from -2.147.483.648 to 2.147.483.647
    val c: Int = 2_147_483_647
    println(c)
    // from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
    val d: Long = 9_223_372_036_854_775_807
    println(d)

    // from 0 to 255
    val e: UByte = 255u
    println(e)
    // from 0 to 65_535
    val f: UShort = 65_535u
    println(f)
    // from 0 to 4_294_967_295
    val g: UInt = 4_294_967_295u
    println(g)
    // from 0 to 18_446_744_073_709_551_615
    val h: ULong = 18_446_744_073_709_551_615u
    println(h)

    // 32 bits
    val i: Float = 2.5f
    println(i)
    // 64 bits
    val j: Double = 3.14
    println(j)

    // true or false
    val k: Boolean = true

    // Characters
    val l: Char = 'a'
    println(l)

    // Strings
    val m: String = "Hello World"
    println(m)
}