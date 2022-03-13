package lesson_five

import java.util.*

class Gel : NailExtension() {
    override fun extension(color: String, design: Boolean, length: LengthNails, shape: FormsNails) {
        println("Наращивание каким-то гелем, цвета $color с дизайном $design, длиной $length и формой $shape")
    }

    override fun paper() {
        paperBase(PaperBase.SMALL)
    }

    override fun doManicure() {
        extension("red", false, LengthNails.LONG, FormsNails.ALMOND)
        trimTheCuticle(Cuticle.HARDWARE)
    }
}