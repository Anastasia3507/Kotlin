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
    val beinAB = 8.0
    val beinCB = 6.0
    val areaOfTriangle = area(beinAB, beinCB)
    val perimeterOfTriangle = perimeter(beinAB, beinCB)
    println("Площадь прямоугольного треугольника равна $areaOfTriangle, периметр прямоугольного треугольника равен $perimeterOfTriangle.")
}

fun area(bein1: Double, bein2: Double) =
    (bein1 * bein2) / 2

fun hypotenuse(beinAB: Double, beinCB: Double) =
    sqrt(beinAB.pow(2.0) + beinCB.pow(2.0))

fun perimeter(bein1: Double, bein2: Double) =
    bein1 + bein2 + hypotenuse(beinCB = bein1, beinAB = bein2)