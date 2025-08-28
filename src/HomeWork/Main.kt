package HomeWork

fun main(){
    val human = Human("Антон")
    human.base()

    println("Описание части тела: \n 1. Голова \n 2. Тело")
    if (readln() == "1"){
        while (true){
            println(human.Head().description())
            break
        }
    }
    if (readln() == "2") {
        while (true) {
            println(human.Body().description())
            break
        }
    }

}