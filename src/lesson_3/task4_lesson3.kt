package lesson_3

import kotlin.random.Random


fun main(){
    val list = Array(20) {0}
    var num = 0
    while (num < list.size) {
        list[num] = Random.nextInt(20)
        print(list[num])
        print(" ")
        num++
    }
    bubbleSort(list)

    minMaxMean() //task 2
}

fun bubbleSort(list: Array<Int>){ //пузырковый метод
    var swop = true
    while (swop){
        swop = false
        for (i in 0 until list.size-1){
            if(list[i] > list[i+1]){
                val n = list[i]
                list[i] = list[i+1]
                list[i+1]=n
                swop = true
            }
        }
    }
    println()
    for (n in list) print(" $n")
    println()
}

fun minMaxMean(){ //максимуум минимум средн

    val array: Array<Int> = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    var i = 0
    var sum = 0
    while (i < array.size) {
        array[i] = Random.nextInt(20)
        print(array[i])
        print(" ")
        i++
        sum += i
    }
    println()

    var min: Int =  array[0]
    var max = 0
    var total = 0
    var mean = 0
    for (element in array) {
        val item = element
        total += item
        if (item < min) {
            min = item
        }
        if (item > max) {
            max = item
        }
    }
    mean = sum/array.size

    println("Максимальное $max, минимальное $min, среднее $mean")
}

