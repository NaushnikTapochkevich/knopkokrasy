package lesson_five

class Acrylic : NailExtension() {
    override fun extension(color: String, design: Boolean, length: LengthNails, shape: FormsNails) {
        println("Акрилловое наращивание, цвета $color с дизайном $design, длиной $length и формой $shape")
    }

    private val paper = paperBase(PaperBase.SMALL)//здесь маникюрщик, измерив размер пальца клиента, укажет какой нужно
}