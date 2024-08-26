fun calculator(input1: Int, input2: Int, operation: String) {
    if (operation == "add") {
        println("The result is: ${input1 + input2}")
    } else if (operation == "subtract") {
        println("The result is: ${input1 - input2}")
    } else if (operation == "multiply") {
        println("The result is: ${input1 * input2}")
    } else if (operation == "divide") {
        if (input2 != 0) {
            println("The result is: ${input1 / input2}")
        } else {
            println("Cannot divide by zero")
        }
    } else {
        println("Invalid operation")
    }
}

fun main() {
    val a = 50
    val b = 10

    calculator(a, b, "add")
    calculator(a, b, "subtract")
    calculator(a, b, "multiply")
    calculator(a, b, "divide")
}
