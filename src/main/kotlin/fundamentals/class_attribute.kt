package fundamentals

class Car(var carName: String, val year: Int, val owner: Owner) {

}

data class Owner(var name: String, var age: Int) {

}

fun main() {
    var car = Car("BMW", 2022, Owner("dh", 26))

    println(car.carName)
    car.carName = "KIA"
    println(car.carName)

    println(car.owner)
    car.owner.name = "Daniel"
    println(car.owner)
}