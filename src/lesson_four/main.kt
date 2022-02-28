package lesson_four

fun main(){
    val anna = grandmother()
    val melissa = mother()
    val bell = descendant()

    println(anna.name)
    println(melissa.name)
    println(bell.name)
    println(bell.sing())
}