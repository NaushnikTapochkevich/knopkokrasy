import kotlin.math.*

fun main(){
    pyramidVolume(10.0, 15.0) //пирамида
    cylinderArea() //цилиндр
    println(quadraticEquationRoot(2.0, 1.0, 1.0)) //квадратный корень
    println(factorial(5)) //факториал
    println(factorialTwo(3))
    println(addTwo(4)) //метод addTwo
    println(sumOfDigits(23214)) //сумма цифр в числе
    sumOfNumbers() //вывод суммы всех чисел до 1000
    println(summ()) //сумма до 200

}

fun pyramidVolume(pyramidHeight: Double, baseSide: Double){
    val volume: Double = (pyramidHeight * baseSide.pow(2))/4 *sqrt(3.0) //формула для объема пирамиды
    //val volume: Double = (1/3*pyramidHeight) * baseSide.pow(2.0) //другой вариант
    println("Volume of a regular pyramid $volume")
}

fun cylinderArea(cylinderHeight: Double= 20.0, cylinderRadius: Double=20.0){
    val square: Double = 2*PI*cylinderRadius*(cylinderRadius+cylinderHeight) //формула для площади цилиндра
    println("Cylinder surface area $square")
}


fun discriminant(a: Double, b: Double, c: Double): Double = sqrt(b) - 4 * a * c

fun quadraticEquationRoot(a: Double, b: Double, c: Double): Double = (-b + sqrt(discriminant(a, b, c))) / (2 * a) //для нахождения квадратного корня




fun factorial(n: Int): Int = if (n < 2) 1 else n * factorial(n - 1)

fun factorialTwo(n: Int): Int { //второй вариант вычисл факторияала
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun addTwo(number: Int?): Int{
    val result: Int = number ?:0 //до меня еще не дошло как правильно сократить
    return result+2
}

fun summ(): Int{
    var num = 1
    var sum = 1
    var count = 0
    while (sum < 200) {
        num++
        sum +=num
        count++
    }
    return count
}

fun sumOfNumbers(){
    val num = 1..1000
    var count = 1
    var sum = 0
    for (i in num) {
        sum += count
        count++
    }
    println("Sum = $sum")
}

fun sumOfDigits(number: Int): Int{
    var sum = 0
    var n = number
    while (n!=0){
        sum += n%10
        n /= 10
    }
    return sum
}