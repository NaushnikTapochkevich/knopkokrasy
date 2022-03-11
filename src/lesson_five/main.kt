package lesson_five

import java.util.*

fun main(){
    val anna: Acrylic = Acrylic() //клиент Анна выбрала наращивание акрил
    val dateAnna = Calendar.getInstance().time
    anna.register("Anna", dateAnna)
    anna.extension("red", false, LengthNails.LONG, FormsNails.ALMOND)
    anna.trimTheCuticle(Nails.Cuticle.TRIM)

    val mary: Manicure = Manicure() //клиент Мэри выбрала маникюр с покраской в красный цвет
    val dateMary = Calendar.getInstance().time
    mary.register("Mary", dateMary)
    mary.colorNails("red")
    mary.trimTheCuticle(Nails.Cuticle.HARDWARE)
}

