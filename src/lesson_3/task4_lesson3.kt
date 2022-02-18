package lesson_3

import kotlin.random.Random


fun main(){
    val list = bubbleSort(intArrayOf(0,9,8,7,8,2,1,5))
    for (n in list) println(n) //task 1

    minMaxMean() //task 2
}

fun bubbleSort(array: IntArray): IntArray{ //пузырковый метод
    var swop = true
    while (swop){
        swop = false
        for (i in 0 until array.size-1){
            if(array[i] > array[i+1]){
                val n = array[i]
                array[i] = array[i+1]
                array[i+1]=n
                swop = true
            }
        }
    }
    return array
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

