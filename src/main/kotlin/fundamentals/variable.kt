package fundamentals

fun main() {
    var name = "dh" // variable (가변)
    val nameVal = "dh" // value (불변)

    name = "Daniel"
//    nameVal = "Daniel"  // *Error*

    val age = 26
    println(age)

    val test: String
    test = "Test"
}

class Variable {
    lateinit var test: String; // 지연 초기화

    fun initialVariable() {
        test = "Test"
    }
}