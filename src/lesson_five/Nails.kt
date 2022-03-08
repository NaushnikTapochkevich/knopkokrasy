package lesson_five

abstract class Nails : BeautyService {
    fun trimTheCuticle(type: Cuticle) {
        if (type == Cuticle.HARDWARE) {
            println("аппаратный")
        } else if (type == Cuticle.TRIM) {
            println("обрезной")
        }
    }

    enum class Cuticle {
        HARDWARE, TRIM
    }
}