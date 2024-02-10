package lessons.lesson_7

import kotlin.math.PI

class Ellipse(height: Double, width: Double) : Rectangle(height, width) {
    override val square: Double get() = PI * (length * width)
    override val perimeter: Double get() = PI * (length + width)
}