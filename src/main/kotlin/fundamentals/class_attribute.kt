package fundamentals

class Car(val name: String, val year: Int) {

}

fun main() {
    var car = Car("BMW", 2022)

    println(car.name)
}