package HomeWork

fun main() {
    val human = Human("Антон")
    human.base()
    human.toLive()

    println("Описание части тела: \n1. Голова \n2. Тело \n3. Ноги")
    val input = readln() //создаем данную переменную для работы типа сканера (с консоли считывает результат и подставляет под заданные if)
    if (input == "1") {
        while (true) {
            human.Head().description()
            break
        }
    }
    if (input == "2") {
        while (true) {
            human.Body().description()
            break
        }
    }
    if (input == "3"){
        while (true){
            human.Legs().description()
            break
        }
    }

}