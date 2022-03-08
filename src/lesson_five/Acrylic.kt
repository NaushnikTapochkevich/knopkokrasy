package lesson_five

class Acrylic : NailExtension(){
    override fun gelOrAcrylic(color: String, design: Boolean, length: LengthNails, shape: FormsNails) {
        println("Акрилловое наращивание, цвета $color с дизайном $design, длиной $length и формой $shape")
    }
}