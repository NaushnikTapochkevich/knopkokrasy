package lesson_five

import java.util.*

class Manicure : Nails() {
    var colorNails = "без покраски"//ранить полем имеется ввиду вот так?

    override fun register(name: String, date: Date) {
        println("регистрация $name на дату $date")
    }

    fun colorNails(color: String = "без покраски") { //по умолчанию не красят
        println("Цвет ногтей $color")
    }

    override fun doManicure() {
        trimTheCuticle(Cuticle.HARDWARE)
        colorNails("red")
    }
}