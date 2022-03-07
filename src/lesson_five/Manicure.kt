package lesson_five

class Manicure: BeautyService {
    fun trimTheCuticle(type: String){
        if (type == "hardware"){
            println("аппаратный")
        }
        else if (type == " trim")
            println("обрезной")
        }

    override fun register(name: String, date: Int) {
        super.register(name, date)
    }
}