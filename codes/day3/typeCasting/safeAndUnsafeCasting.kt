fun main(args: Array<String>) {
    var a = "Hello"
    var b : String  = a as String
    println("Unsafe casting result: $b")
    val num: Int = a as Int
    println("Unsafe casting result: $num")
}