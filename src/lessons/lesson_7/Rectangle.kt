package lessons.lesson_7

open class Rectangle(val length: Double, val width: Double) : Shape() {
    override val square: Double get() = length * width
    override val perimeter: Double get() = 2 * (length + width)
}