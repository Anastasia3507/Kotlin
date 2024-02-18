package lessons.lesson_9

sealed class DistanceUnit {
    class Versta(val title: String, val denotation: String, val countries: MutableList<String>) : DistanceUnit()
    class Kilometer(val title: String, val denotation: String, val countries: MutableList<String>) : DistanceUnit()
    class Mile(val title: String, val denotation: String, val countries: MutableList<NonISUCountry>) : DistanceUnit()


    enum class NonISUCountry(val country: String) {
        USA("США"),
        LIBERIA("Либерия"),
        MYANMAR("Мьянма")
    }
}
