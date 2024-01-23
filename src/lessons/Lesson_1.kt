package lessons

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    // задание 1
    val firstString = "I can"
    val secondString = "code"
    println("$firstString $secondString!")

    // задание 2
    val myAge = 25
    val myAgeInTenYear = myAge + 10
    val daysInYear = 365.25
    val daysPassed: Float = daysInYear.toFloat() * myAgeInTenYear.toFloat()
    println("Мой возраст $myAge лет. Через 10 лет, мне будет $myAgeInTenYear лет, с момента моего рождения пройдет $daysPassed дней.")

    // задание 3
    val bein_1 = 8.0
    val bein_2 = 6.0
    val areaOfTriangle = area(bein_1, bein_2)
    val perimeterOfTriangle = perimeter(bein_1, bein_2)
    println("Площадь прямоугольного треугольника равна $areaOfTriangle, периметр прямоугольного треугольника равен $perimeterOfTriangle.")
}

fun area(bein_1: Double, bein_2: Double) =
    (bein_1 * bein_2) / 2

fun hypotenuse(beinAB: Double, beinCB: Double) =
    sqrt(beinAB.pow(2.0) + beinCB.pow(2.0))

fun perimeter(bein_1: Double, bein_2: Double) =
    bein_1 + bein_2 + hypotenuse(beinCB = bein_1, beinAB = bein_2)