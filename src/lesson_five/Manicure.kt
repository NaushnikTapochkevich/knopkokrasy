package lesson_five

import java.util.*

class Manicure : Nails() {

    override fun register(name: String, date: Date) {
        println("регистрация $name на дату $date")
    }

    fun doManicure(color: String, cuticle: Cuticle) {
        trimTheCuticle(cuticle)
        colorNails = color
    }
}