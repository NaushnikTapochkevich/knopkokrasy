package lesson_four


open class mother(var cry: String, var footSize: String): grandmother(){
    override val image = ".jpg"
    override val name = "Melissa"
    override val likeFood = "banana"
    private val company = "Oriflame"

    override fun sing() {
        println("И снова седая ночь!")
    }

    override fun eat() {
        println("Mama ест $likeFood")
    }
}