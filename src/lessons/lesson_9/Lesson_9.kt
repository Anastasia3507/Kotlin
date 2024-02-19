package lessons.lesson_9

fun main() {
    /* Задание 2
    2.1 Создайте перечисление DistanceUnit (Единица измерения расстояния) со следующими кейсами: versta, kilometer, mile.
    Внутри перечисления DistanceUnit создайте еще одно перечисление NonISUCountry в котором содержится перечень стран не
    принявших международную систему единиц (США, Либерия и Мьянма).
    Верста и километр должны иметь ассоциативный параметры следующего типа: (title: String, denotation: String,
    countries: [String]). Миля - (title: String, denotation: String, countries: [NonISUCountry]). Первый параметр - это
    название единицы измерения, второй параметр отвечает за обозначение единицы, а массив должен содержать перечень
    стран в которых используется эта единица (для километра не обязательно перечислять все страны).
    2.2 Создайте по экземпляру DistanceUnit для каждого кейса и функцию, которая должна принимать единицу измерения и
    выводить на консоль информацию о ней, например: "Километр. Краткое наименование: км. Страны: Россия, Евросоюз".
    */

    val versta: DistanceUnit.Versta = DistanceUnit.Versta("Верста", "верста", mutableListOf("Русь"))
    val kilometer = DistanceUnit.Kilometer("Километр", "км", mutableListOf("Россия", "Евросоюз"))
    val mile = DistanceUnit.Mile(
        "Миля",
        "миля",
        mutableListOf(
            NonISUCountry.USA,
            NonISUCountry.LIBERIA,
            NonISUCountry.MYANMAR
        )
    )

    versta.getInfoUnit()
    kilometer.getInfoUnit()
    mile.getInfoUnit()
}

//fun getInfoUnit(unit: DistanceUnit) {
//    when (unit) {
//        is DistanceUnit.Versta -> println("${unit.title}. Краткое наименование: ${unit.denotation}. Страны: ${unit.countries}")
//        is DistanceUnit.Kilometer -> println("${unit.title}. Краткое наименование: ${unit.denotation}. Страны: ${unit.countries}")
//        is DistanceUnit.Mile -> {
//            println("${unit.title}. Краткое наименование: ${unit.denotation}. Страны: ${getCountry(unit)}")
//        }
//    }
//}

//private fun getCountry(mile: DistanceUnit.Mile) = mutableListOf<String>().apply {
//    mile.countries.forEach {
//        this.add(it.country)
//    }
//}