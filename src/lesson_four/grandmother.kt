package lesson_four

open class grandmother {
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

    open fun sleep() {
        println("Бабушка спит")
    }

    protected fun dance() {
        println("Бабушка танцует")
    }
}