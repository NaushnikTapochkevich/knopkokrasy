package lesson_four

class Descendant : Mother() {
    override val image = ".jpg"
    override val name = "Bell"
    override val likeFood = "мясо"
    val phone = "Xsiomi"

    override fun sing() {
        println("Воет! У-у-у-у!")
    }

    override fun eat() {
        println("Потомок ест $likeFood")
    }

    private fun tel(){
        println("my phone $phone")
    }
}