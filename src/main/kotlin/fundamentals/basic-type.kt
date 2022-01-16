package fundamentals

import kotlin.reflect.typeOf

fun main() {
    val a: Int? = 1
//    val b: Long? = a
//    println(a == b) // Error

    val b: Byte = 1
    val b1: Int = b.toInt()
    println(a == b1)

    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 - 2.71)
    println(10.0 / 3)

    val x = 5 / 2
    println(2 == x)

    val y = 5L / 2
    println(y == 2L)

    val z = 5 / 2.toDouble()
    println(z == 2.5)

    // ------------------------- //

    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)

    // ------------------------- //

    val aChar: Char = 'a'

    println(aChar)
    println('\n')
    println('\uFF00')

    // ------------------------- //

    val str = "abcd 1234"

    for (c in str) {
        println(c)
    }

    val str2 = "abcd"
    println(str2.uppercase()) // ABCD
    println(str2) // abcd

    val s = "abc" + 1
    println(s + "def") // abc1def

    val i = 10
    println("i = ${i}")

    val s2 = "abc"
    println("s2.length is ${s2.length}")

    val price = """
       ${'$'}_9.99 
    """
    println(price)

    // ------------------------- //

    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) } // 0, 1, 4, 9, 16
}