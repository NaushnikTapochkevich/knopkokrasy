package lesson_five

import java.util.*

class Acrylic : NailExtension() {
    override fun extension(color: String, design: Boolean, length: LengthNails, shape: FormsNails) {
        println("Акрилловое наращивание, цвета $color с дизайном $design, длиной $length и формой $shape")
    }

    override fun paper() {
        paperBase(PaperBase.MEDIUM)
    }

    override fun doManicure() {
        extension("red", false, LengthNails.LONG, FormsNails.ALMOND)
        trimTheCuticle(Cuticle.TRIM)
    }
}