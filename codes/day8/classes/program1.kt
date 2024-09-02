class Car(val make: String, val model: String, var year: Int) {
    fun start() {
        println("$make $model is starting.")
    }

    fun drive() {
        println("$make $model is driving.")
    }

    fun displayDetails() {
        println("Car Details: $year $make $model")
    }
}

fun main() {
    val myCar = Car("Toyota", "Corolla", 2020)
    myCar.displayDetails()

    myCar.start()
    myCar.drive()
}
