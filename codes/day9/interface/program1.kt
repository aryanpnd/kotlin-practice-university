interface Shape{
    fun area():Double
}
open class Rectangle(val a:Double,val b:Double):Shape{
    override fun area():Double{
        return a*b
    }
    open fun display(){
        println("area of rectangle with dimenssions $a*$b is ${area()}")
    }
}

class Square(side:Double):Rectangle(side,side){
     fun display(){
        println("area of square with side $a is ${area()}")
    }
}

fun main(args: Array<String>) {
    val myRectangle = Rectangle(4.0,5.0)
    myRectangle.display()
    val mySquare = Square(3.0)
    mySquare.display()
}