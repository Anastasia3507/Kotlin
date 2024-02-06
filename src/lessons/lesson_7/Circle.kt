package lessons.lesson_7

import kotlin.math.PI
import kotlin.math.pow

class Circle(private val radius: Double) : Shape() {
    override val square: Double get() = PI * radius.pow(2)
    override val perimeter: Double get() = 2 * PI * radius
}