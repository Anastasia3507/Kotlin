package lessons.lesson_8

enum class DistanceUnit(val title: String, val denotation: String, val countries: MutableList<String>) {
    VERSTA("Верста", "верста", mutableListOf("Русь")),
    KILOMETER("Километр", "км", mutableListOf("Россия", "Евросоюз")),
    MILE(
        "Миля",
        "миля",
        mutableListOf(NonISUCountry.USA.country, NonISUCountry.LIBERIA.country, NonISUCountry.MYANMAR.country)
    );

    enum class NonISUCountry(val country: String) {
        USA("США"),
        LIBERIA("Либерия"),
        MYANMAR("Мьянма")
    }
}