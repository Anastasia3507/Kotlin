package lessons

fun main(){
    // задание 1
    val numberOne = 13.4F
    val numberTwo = 42.0F
    val sumOfTwoNumbers: Double = numberOne.toDouble() + numberTwo.toDouble()
    println("Сумма двух чисел равна $sumOfTwoNumbers")

    // задание 2
    val numberThree  = 17
    val numberFour = 9
    val result = numberThree / numberFour
    val remainder = numberThree % numberFour
    println("При делении $numberThree на $numberFour результат равен $result, остаток равен $remainder.")
    println("Результат деления $numberThree на $numberFour равен $result $remainder/$numberFour.")

    // задание 3
    val dayOfBirth = 12
    val monthOfBirth = 11
    val yearOfBirth = 1998

    val currentDay = 23
    val currentMonth = 1
    val currentYear = 2024

    val secondPerDay = 60 * 60 * 24
    val daysPerMonth = 30
    val daysPerYear = 360

    val dayFromBirth = calculateNumberOfDaySinceBirth(currentYear, yearOfBirth, monthOfBirth, currentMonth, dayOfBirth, currentDay, daysPerYear, daysPerMonth)
    val secondFromBirth = dayFromBirth * secondPerDay
    val yearsFromBirth = secondFromBirth / secondPerDay / daysPerYear
    val monthFromBirth = secondFromBirth / secondPerDay / daysPerMonth
    println("$yearsFromBirth years, $monthFromBirth months, $dayFromBirth days and $secondFromBirth seconds have passed since my birth.")
}

fun calculateNumberOfDaySinceBirth(
    currentYear: Int,
    yearOfBirth: Int,
    monthOfBirth: Int,
    currentMonth: Int,
    dayOfBirth: Int,
    currentDay: Int,
    daysPerYear: Int,
    daysPerMonth: Int): Int {
    var daysFromBirth = (currentYear - yearOfBirth) * daysPerYear
    daysFromBirth += (currentMonth - monthOfBirth) * daysPerMonth
    daysFromBirth += currentDay - dayOfBirth
    return daysFromBirth
}
