fun main(args: Array<String>) {
    val dayOfWeek = 5
    val dayName = when(dayOfWeek){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else -> "Invalid day"
    }
    println(dayName)
}