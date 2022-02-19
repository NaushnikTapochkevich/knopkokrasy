package lesson_3

import kotlin.random.Random


fun main(){
    val list = Array(20) {0}
    var num = 0
    var sum = 0
    while (num < list.size) {
        list[num] = Random.nextInt(20)
        print(list[num])
        print(" ")
        num++
        sum += num
    }//data

    bubbleSort(list)//task 1

    minMaxMean(list, sum) //task 2
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

fun minMaxMean(array: Array<Int>, sum: Int){ //максимуум минимум средн

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

