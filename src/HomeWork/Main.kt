package HomeWork

fun main() {
    val human = Human("Антон")
    human.base()

    println("Описание части тела: \n1. Голова \n2. Тело \n3. Ноги")
    if (readln() == "1") {
        while (true) {
            human.Head().description()
            break
        }
    }
    if (readln() == "2") {
        while (true) {
            human.Body().description()
            break
        }
    }
    if (readln() == "3"){
        while (true){
            human.Legs().description()
            break
        }
    }
}