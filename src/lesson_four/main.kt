package lesson_four

fun main(){
    val anna = Grandmother()
    val melissa = Mother()
    val bell = Descendant()

    println(anna.name)
    println(melissa.name)
    println(bell.name)
    println(bell.sing())
}