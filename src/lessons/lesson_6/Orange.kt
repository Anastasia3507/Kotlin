package lessons.lesson_6

import kotlin.math.PI
import kotlin.math.pow

class Orange(
    val color: String? = "orange",
    val taste: String? = "sweet",
    val radius: Double,
) {
    private fun calculateOrangeVolume() = 4 / 3 * PI * radius.pow(3)
    val orangeVolume get() = calculateOrangeVolume()
}