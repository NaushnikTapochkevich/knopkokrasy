package lesson_five

class Gel : NailExtension() {
    override fun extension(color: String, design: Boolean, length: LengthNails, shape: FormsNails) {
        println("Наращивание каким-то гелем, цвета $color с дизайном $design, длиной $length и формой $shape")
    }

    override fun paper() {
        paperBase(PaperBase.SMALL)
    }
}