package lesson_five

import java.util.*

abstract class NailExtension : Nails() {

    abstract fun extension(color: String = "colorless", design: Boolean, length: LengthNails, shape: FormsNails)

    protected fun paperBase(length: PaperBase) {
        if (length == PaperBase.SMALL) {
            println("Бумажная основа должна быть маленькая")
        } else if (length == PaperBase.MEDIUM) {
            println("Бумажная основа должна быть средняя")
        } else if (length == PaperBase.LARGE) {
            println("Бумажная основа должна быть большая")
        }
    }
    abstract fun paper()

    override fun register(name: String, date: Date) {
        println("регистрация $name на дату $date")
    }
}

enum class FormsNails {
    OVAL, SQUARE, ROUNDEDSQUARE, ALMOND, STILLETON
}

enum class LengthNails {
    SHORT, LONG, VERYLONG
}

enum class PaperBase {
    SMALL, MEDIUM, LARGE
}