fun ageClassification(age:Int){
    if(age<13){
        println("Your are a child")
    }else if(age in 13..19){
        println("You are a teenager")
    }else if(age in 20..64){
        println("Your are an adult")
    }else{
        println("You are a senior")
    }
}

fun main(args: Array<String>) {
    val age  = 15
    ageClassification(age)
}