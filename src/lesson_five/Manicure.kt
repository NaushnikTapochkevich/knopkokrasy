package lesson_five

import java.time.LocalDate

class Manicure : Nails() {

    override fun register(name: String, date: LocalDate) {
        println("регистрация $name на дату $date")
    }

    fun colorNails(color: String = "без покраски") { //по умолчанию не красят
        println("Цвет ногтей $color")
    }
}