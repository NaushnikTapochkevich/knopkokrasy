package lesson_four

open class Grandmother {
    open val image = ""
    open val name = "Anna"
    open val likeFood = "shawarma"
    var age = 170

    open fun sing() {
        println("Бабушка издаёт звук")
    }

    open fun eat() {
        println("Бабушка ест")
    }

    private fun sleep() {
        println("Бабушка спит")
    }

    private fun dance() {
        println("Бабушка танцует")
    }
}