package lessons.lesson_7

class Rectangle(private val length: Double, private val width: Double) : Shape() {
    override val square: Double get() = length * width
    override val perimeter: Double get() = 2 * (length + width)
}