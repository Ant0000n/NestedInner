package HomeWork

//Создать класс Human(человек).  В нем создать несколько внутренних классов, например, head(голова),
// legs(ноги), в каждом из классов напишите функции этой части тела.
// В главной функции опишите модель человека, вызвав всю функциональность написанных классов.

class Human(val name: String) {
    fun base() {
        println("Характеристики человека: $name")
    }

    inner class Head {
        fun description() {
            println("\n${hairСolor()} \n${hairCut()} \n${eyeColor()}")
        }

        fun hairСolor(): String {
           return "Цвет волос: русый с тёмным оттенком"
        }

        fun hairCut(): String {
            return "Стрижка: короткая, бокс или цезарь"
        }

        fun eyeColor():  String {
            return "Цвет глаз: серо-голубой"
        }
    }

    inner class Body {
        fun description() {
            println("\n${bodyType()} \n${colorSkin()}")
        }

        fun bodyType(): String {
            return "Телосложение: спортивное"
        }

        fun colorSkin(): String {
            return "Цвеи кожи: светлый со специфическим загаром"
        }
    }

    inner class Legs {
        fun description() {
            println("\n${footSize()} \n${gait()}")
        }

        fun footSize(): String { return "Размер ноги: 44.5 (28 см)"
        }

        fun gait(): String {
            return "Походка: ровная без изъянов"
        }
    }
}

