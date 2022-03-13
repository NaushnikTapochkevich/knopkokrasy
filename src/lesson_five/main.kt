package lesson_five

import java.util.*

fun main(){
    val anna: Acrylic = Acrylic() //клиент Анна выбрала наращивание акрил
    anna.record("Anna")
    anna.doManicure()
    val mary: Manicure = Manicure() //клиент Мэри выбрала маникюр с покраской в красный цвет
    mary.record("Mary")
    mary.doManicure()
}

