package lesson_five

class EyebrowCorrection: BeautyService {
    override fun register(name: String, date: Int) {
        super.register(name, date)
    }
    fun eyebrowCorrection(){
        println("выщипываю брови")
    }
}