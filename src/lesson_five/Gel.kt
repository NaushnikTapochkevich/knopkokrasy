package lesson_five

class Gel : NailExtension() {
    override fun gelOrAcrylic(color: String, design: Boolean, length: LengthNails, shape: FormsNails) {
        println("Наращивание каким-то гелем, цвета $color с дизайном $design, длиной $length и формой $shape")
    }
}