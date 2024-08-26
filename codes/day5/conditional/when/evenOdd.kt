fun main(args: Array<String>) {
    val number = 8

    val result = when {
        number % 2 == 0 -> "Even"
        number % 2 != 0 -> "Odd"
        else -> "Invalid number"
    }

    println(result)
}
