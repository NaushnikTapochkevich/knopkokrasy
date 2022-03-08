package lesson_five

import java.time.LocalDate

class EyebrowCorrection : BeautyService {
    override fun register(name: String, date: LocalDate) {
        println("регистрация $name на дату $date")
    }

    fun eyebrowCorrection() {
        println("выщипываю брови")
    }
}