package lesson_five

fun main(){
    val anna: NailExtension = NailExtension()
    anna.register("Anna", 22)
    anna.acrylic("red", "", "LONG", "ALMOND")
    anna.paperBase("MEDIUM")
    val many: Manicure = Manicure()
    many.register("Many", 44)
    many.trimTheCuticle("hardware")
}

