fun main(args: Array<String>) {
    var arr: Array<Array<Int>> = arrayOf(
        Array(5) { i -> i },
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(6, 7, 8, 9, 10)
    )
    
    for (i in arr) {     
        for (j in i) {
            print("$j ")  
        }
        println()
    }
}
