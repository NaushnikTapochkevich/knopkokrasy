package lesson_five

interface BeautyService {
    fun register(name: String, date: Int){
        println("регистрация $name на дату $date")
    }
}