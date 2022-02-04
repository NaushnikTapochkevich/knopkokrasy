fun main() {
    val name: String = "Cheburek"
    val age: Int = 89
    val balance: Double = 1234000.00
    val glutenOrNotGluten: Boolean = false
    var gluten: String
    if(glutenOrNotGluten)
        gluten = "ем глютен"
    else
        gluten = "не ем глютен"
    println("Мое имя $name, мне $age лет и мой баланс $balance, но я $gluten")
}