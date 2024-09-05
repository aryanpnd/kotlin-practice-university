class BankAccount(private var balance: Double) {

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient funds! Your current balance is: $$balance")
        } else {
            balance -= amount
            println("Withdrawal successful! Your new balance is: $$balance")
        }
    }
    fun displayBalance() {
        println("Current balance: $$balance")
    }
}

fun main() {
    val account = BankAccount(1000.0)

    val withdrawals = listOf(200.0, 500.0, 400.0)

    account.displayBalance()
    for (amount in withdrawals) {
        println("Attempting to withdraw $$amount...")
        account.withdraw(amount)

        println("Continue to next withdrawal? Yes")
    }

    println("Thank you for using our banking service!")
}
