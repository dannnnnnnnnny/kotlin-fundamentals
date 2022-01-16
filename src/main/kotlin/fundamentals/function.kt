package fundamentals

fun main(): Unit {
    val name = returnName()
    println(name)

    testFun(name, 26)
    testFun(age = 30, name = "Loopy") // 매개변수를 명시해서 순서 상관없이 가능
    testFun(name = "chicken") // age default 50
}

fun returnName(): String {
    return "dh"
}

fun testFun(name: String, age: Int = 50): Unit {
    println("name: ${name}, age: ${age}")
}