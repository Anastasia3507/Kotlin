package lessons.lesson_9

fun main() {
    val versta: DistanceUnit.Versta = DistanceUnit.Versta("Верста", "верста", mutableListOf("Русь"))
    val kilometer = DistanceUnit.Kilometer("Километр", "км", mutableListOf("Россия", "Евросоюз"))
    val mile = DistanceUnit.Mile(
        "Миля",
        "миля",
        mutableListOf(
            DistanceUnit.NonISUCountry.USA,
            DistanceUnit.NonISUCountry.LIBERIA,
            DistanceUnit.NonISUCountry.MYANMAR
        )
    )

    getInfoUnit(versta)
    getInfoUnit(kilometer)
    getInfoUnit(mile)
}

fun getInfoUnit(unit: DistanceUnit) {
    when (unit) {
        is DistanceUnit.Versta -> println("${unit.title}. Краткое наименование: ${unit.denotation}. Страны: ${unit.countries}")
        is DistanceUnit.Kilometer -> println("${unit.title}. Краткое наименование: ${unit.denotation}. Страны: ${unit.countries}")
        is DistanceUnit.Mile -> {
            println("${unit.title}. Краткое наименование: ${unit.denotation}. Страны: ${getCountry(unit)}")
        }
    }
}

private fun getCountry(mile: DistanceUnit.Mile): MutableList<String> {
    val listCountryMile = mutableListOf<String>()
    mile.countries.forEach {
        listCountryMile.add(it.country)
    }
    return listCountryMile
}