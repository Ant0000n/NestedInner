package HomeWork

fun main(){
    val human = Human("Антон")
    human.base()

    println("Описание части тела: \n 1. Голова ")
    if (readln() == "1"){
        while (true){
            println(human.Head().description())
        }
    }
}