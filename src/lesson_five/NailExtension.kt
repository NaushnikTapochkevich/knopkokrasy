package lesson_five

class NailExtension : BeautyService {
    fun acrylic(color: String = "colorless", design: String = "no design", length: String, shape: String){
        println("Акрилловое наращивание, цвета $color с дизайном $design, длиной $length и формой $shape")
    }
    fun gel(color: String = "colorless", design: String = "no design", length: Int, shape: String){
        println("Наращивание каким-то гелем, цвета $color с дизайном $design, длиной $length и формой $shape")
    }
    fun paperBase(length: String){
        val lengthShort = "SMALL"
        val lengthLong = "MEDIUM"
        val lengthVeryLong = "LARGE"
        if (length == lengthShort){
            println("Бумажная основа должна быть маленькая")
        }
        else if (length == lengthLong){
            println("Бумажная основа должна быть средняя")
        }
        else if (length == lengthVeryLong){
            println("Бумажная основа должна быть большая")
        }
    }
    override fun register(name: String, date: Int) {
        super.register(name, date)
    }
}

enum class FormsNails{
    OVAL, SQUARE, ROUNDEDSQUARE, ALMOND, STILLETON
}
enum class lengthNails{
    SHORT, LONG, VERYLONG
}