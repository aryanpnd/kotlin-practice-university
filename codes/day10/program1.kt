class Customer(private val totalAmount: Double, private val hasMembership: Boolean) {

    fun checkDiscountEligibility() {
        if (totalAmount >= 1000) {
            if (hasMembership) {
                println("You are eligible for a 20% discount as a member!")
            } else {
                println("You are eligible for a 10% discount!")
            }
        } else {
            println("You are not eligible for a discount.")
        }
    }
}

fun main() {
    val customer1 = Customer(1200.0, true) 
    customer1.checkDiscountEligibility()

    val customer2 = Customer(800.0, false) 
    customer2.checkDiscountEligibility()
}
