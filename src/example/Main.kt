package example

fun main(){
    val student = Student("Иван")
    var arrayOfEstimation: Array<Student.Estimation> = arrayOf()

    println("Заполни электронный дневник:\n 1.Да \n 2.Нет")
    if (readln() == "1"){
        while (true){
            println("Введите предмет и оценку")
            val lesson = readln()
            val estimation = readln()
            arrayOfEstimation += Student.Estimation(lesson, estimation)
            println("Продолжить: \n 1.Да \n 2.Нет")
            if (readln() == "2") break
        }
    }
    println("Электронный дневник студента ${student.nameUniversity}: ${student.name} ")
    if (arrayOfEstimation.isNotEmpty()) println(arrayOfEstimation.contentToString())
    else println("Дневник без оценок")
}