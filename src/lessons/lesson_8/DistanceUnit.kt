package lessons.lesson_8

enum class DistanceUnit { // не доделала
    VERSTA,
    KILOMETER,
    MILE;

    enum class NonISUCountry(country: String) {
        USA("США"),
        LIBERIA("Либерия"),
        MYANMAR("Мьянма")
    }
}
