fun main(args: Array<String>) {
    val basket = listOf("Apple","Banana","Cherry")

    for (fruit in basket) {
        println("fruit name $fruit at ${basket.indexOf(fruit)} position")
    }
    //or
    for (fruit in basket.indices) {
        println("fruit name ${basket[fruit]} at ${fruit} position")
    }
}