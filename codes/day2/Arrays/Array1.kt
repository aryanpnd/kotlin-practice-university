fun main(args: Array<String>) {
    var arr1:Array<Int> = arrayOf(1,2,3,4,5)
    println(arr1)

    var arr2:Array<String> = arrayOf("kotlin","java","scala")
    println(arr2)
    
    var square = Array(5) { i -> i * i }
    println(square.joinToString(" "))

}