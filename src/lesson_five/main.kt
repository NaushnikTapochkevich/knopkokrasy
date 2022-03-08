package lesson_five

import java.time.LocalDate

fun main(){
    val anna: Acrylic = Acrylic() //клиент Анна выбрала наращивание акрил
    val dateAnna = LocalDate.parse("2022-11-21")
    anna.register("Anna", dateAnna)
    anna.gelOrAcrylic("red", false, LengthNails.LONG, FormsNails.ALMOND)
    anna.trimTheCuticle(Nails.Cuticle.TRIM)

    val mary: Manicure = Manicure() //клиент Мэри выбрала маникюр с покраской в красный цвет
    val dateMary = LocalDate.parse("2022-11-30")
    mary.register("Mary", dateMary)
    mary.colorNails("red")
    mary.trimTheCuticle(Nails.Cuticle.HARDWARE)
}

