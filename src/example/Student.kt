package example

class Student(val name: String): University(), University.Information {
    val estimations: Array<Estimation> = arrayOf()
    override val nameUniversity: String = "МГУ"
    override fun printInfo() {
        println("Студент университета: ${nameUniversity}: $name")
    }

    class Estimation(val lesson: String, val estimation: String) {
        override fun toString(): String {
            return "урок = '$lesson', оценка = '$estimation'"
        }

    }

}