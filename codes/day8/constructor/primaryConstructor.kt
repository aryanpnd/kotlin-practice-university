class Person(var name:String,var age:Int) {
    constructor(x:String):this(){
        this.name=x
        this.age=0
    }
    constructor():this("rahul",50)
    fun intro(){
        println("My name is $name and $age")
    }
}
fun main(args: Array<String>) {
    var a = Person("Aryan",19)
    a.intro()
    var b = Person("Aryan")
    a.intro()
    var c = Person()
    a.intro()
}