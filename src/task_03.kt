import kotlin.math.*

fun main(){
    pyramidVolume(10.0, 15.0) //пирамида
    cylinderArea() //цилиндр
    quadraticEquationRoot(2.0, 3.0, 6.0) //квадратный корень
    println(factorial(5)) //факториал
    println(addTwo(4)) //метод addTwo
    println(sumOfDigits(234)) //сумма цифр в числе
    sumOfNumbers() //вывод суммы всех чисел до 1000
    println(summ()) //сумма до 200

}

fun pyramidVolume(pyramidHeight: Double, baseSide: Double){
    var V: Double = (pyramidHeight * baseSide.pow(2))/4 *sqrt(3.0) //формула для объема пирамиды
    //val V: Double = (1/3*pyramidHeight) * baseSide.pow(2.0) //другой вариант
    V *= 1000000 //чтобы перевести в куб. сантиметры
    println("Volume of a regular pyramid $V")
}

fun cylinderArea(cylinderHeight: Double= 20.0, cylinderRadius: Double=20.0){
    val pi = 3.14159265359
    var S: Double = 2*pi*cylinderRadius*(cylinderRadius+cylinderHeight) //формула для площади цилиндра
    S *= 1000000 //перевести в куб. сантиметры
    println("Cylinder surface area $S")
}


fun discriminant(a: Double, b: Double, c: Double) = sqrt(b) - 4 * a * c //дискриминант

fun quadraticEquationRoot(a: Double, b: Double, c: Double){
    val squareRoot: Double = (-b + sqrt(discriminant(a, b, c))) / (2 * a) //для нахождения квадратного корня
    println("square root $squareRoot")
} // no ok



fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1) //ok

/*fun factorial(n: Int): Double { //второй вариант вычисл факторияала
    var result = 1.0
    for (i in 1..n) {
        result *= i
    }
    return result
}*/

fun addTwo(number: Int?): Int{
    val result: Int = number ?:0
    return result+2
} // ok

fun summ(): Int{
    val i = 1
    var count = 0
    var result: Int = i
    while (result<200) {
        result += i
        count++
    }
    return count
} // ok

fun sumOfNumbers(){
    val num = 1000
    var i = 1
    var sum = 0
    while (i <= num) {
        sum += i
        i++
    }
    println("Sum = $sum")
}

fun sumOfDigits(n: Int): Int{
    val m: Int = n%100/10
    val sum = n/100+m+(n%100%10)
    return sum
}