package lesson_five

import java.util.*

class EyebrowCorrection : BeautyService {
    override fun register(name: String, date: Date) {
        println("регистрация $name на дату $date")
    }

    fun eyebrowCorrection() {
        println("выщипываю брови")
    }
}