package lab_works// Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран.

import kotlin.random.Random

fun main() {
    // создание массива с рандомными числами
    val randomValues = Array(10) { Random.nextInt() }
    var result = ""
    randomValues.forEach {
        result += "$it,"
    }
    println("[${result.substring(0, result.count() - 1)}]")

    // сортировка по возрастанию
    randomValues.sort()
    var result2 = ""
    randomValues.forEach {
        result2 += "$it,"
    }
    println("[${result2.substring(0, result2.count() - 1)}]")
}