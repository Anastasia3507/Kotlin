package lessons.lesson_9

sealed class DistanceUnit(val title: String, val denotation: String) {
    abstract fun getInfoUnit()

    class Versta(title: String, denotation: String, private val countries: MutableList<String>) :
        DistanceUnit(title, denotation) {
        override fun getInfoUnit() {
            println("${title}. Краткое наименование: ${denotation}. Страны: $countries")
        }
    }

    class Kilometer(title: String, denotation: String, private val countries: MutableList<String>) :
        DistanceUnit(title, denotation) {
        override fun getInfoUnit() {
            println("${title}. Краткое наименование: ${denotation}. Страны: $countries")
        }
    }

    class Mile(title: String, denotation: String, private val countries: MutableList<NonISUCountry>) :
        DistanceUnit(title, denotation) {
        private fun getCountry(mile: Mile) = mutableListOf<String>().apply {
            mile.countries.forEach {
                this.add(it.country)
            }
        }

        override fun getInfoUnit() {
            println("${title}. Краткое наименование: ${denotation}. Страны: ${getCountry(this)}")
        }
    }
}


enum class NonISUCountry(val country: String) {
    USA("США"),
    LIBERIA("Либерия"),
    MYANMAR("Мьянма")
}
