class Person {
    var name: String = "aryan"
    val age:Int = 30
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main(args: Array<String>) {
    val person = Person()
    person.displayInfo()
}