fun fibonacci(num: Int): Int {
    return if (num <= 1) {
        num
    } else {
        fibonacci(num - 1) + fibonacci(num - 2)
    }
}

fun main(args: Array<String>) {
    val result = fibonacci(5)
    println(result) 
}
