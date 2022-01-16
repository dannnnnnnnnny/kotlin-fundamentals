package fundamentals

data class Person2(var name: String, var age: Int) {

}

class Person(var name: String, var age: Int) {
    override fun toString(): String {
        return "Class: Person, Name: ${name}, Age: ${age}"
    }
}

fun main() {

    var dataClassDh = Person2("dh", 26)
    println(dataClassDh) // Person2(name=dh, age=26)

    var dh = Person("dh", 26)
    println(dh) // fundamentals.Person@3ac3fd8b, // override fun toString() 와 동일한 결과
    println(dh.toString())

}