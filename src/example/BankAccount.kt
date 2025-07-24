package example

class BankAccount(private var sum: Int) {

    fun display(){
        println("sum = $sum")
    }

    inner class Transaction{
        fun pay(s: Int){
            sum -= s
            display()
        }
    }
}