package HomeWork

// Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов".
// Написать программу поиска и вывода на экран элементов массива по вводимым символам

fun main() {
    val persons = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    search(persons)
}

fun search(persons: Array<String>) {
    println("Введите имя:")
    val input = readln()
    println("Результаты:")
    for (person in persons){
        var check = true
        for (i in input.indices){
            if (person[i] != input[i]){
                check = false
                break
            }
        }
        if (check){
            println(person)
        }
    }
}

