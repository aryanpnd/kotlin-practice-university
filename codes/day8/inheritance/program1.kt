open class Rectangle(val a: Double,val b: Double){
    fun area(): Double {
        return a*b
    }
    open fun display(){
        println("area of rectangle with dimensions $a *$b is ${area()}")
    }
}

class Square(side: Double):Rectangle(side,side){
    override fun display(){
        println("area of square with side $a is ${area()}")
    }
}

fun main(args: Array<String>) {
    val myRectangle = Rectangle(4.0,5.0)
    myRectangle.display()
    val mySquare = Square(3.0)
    mySquare.display()
}