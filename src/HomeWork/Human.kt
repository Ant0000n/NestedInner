package HomeWork

//Создать класс Human(человек).  В нем создать несколько внутренних классов, например, head(голова),
// legs(ноги), в каждом из классов напишите функции этой части тела.
// В главной функции опишите модель человека, вызвав всю функциональность написанных классов.

class Human (val name: String) {
    fun base() {
        println("Характеристики человека: $name")
    }

    inner class Head{
        fun description(){
            println("\n ${hairСolor()} \n ${hairCut()} \n ${eyeColor()}")
        }
        fun hairСolor(){
            println("Цвет волос: русый с тёмным оттенком")
        }
        fun hairCut(){
            println("Стрижка: короткая, бокс или цезарь")
        }
        fun eyeColor(){
            println("Цвет глаз: серо-голубой")
        }

    }
}

