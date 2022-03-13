package lesson_five

import java.util.*

abstract class Nails : BeautyService {
    fun trimTheCuticle(type: Cuticle) {
        when (type) {
            Cuticle.HARDWARE -> println("аппаратный")
            else -> println("обрезной")
        }
    }

    fun record(name: String) {
        val date = Calendar.getInstance().time
        register(name, date)
    }

    abstract fun doManicure()
}

enum class Cuticle {
    HARDWARE, TRIM
}