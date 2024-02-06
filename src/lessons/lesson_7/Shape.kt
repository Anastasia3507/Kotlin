package lessons.lesson_7

abstract class Shape() {
    private val nameShape: String = "" // нужно вывести название на основе имени класса
    open val square: Double get() = 0.0
    open val perimeter: Double get() = 0.0
    val description get() = "Square of shape $nameShape is $square. Perimeter - $perimeter"
}