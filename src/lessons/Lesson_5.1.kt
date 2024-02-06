package lessons

fun main() {
    /*  Задание 1
    1.1 Повторите задания 3.1 - 3.4 прошлого урока.
    1.2 Создайте универсальную функцию для фильтрации переданного в неё массива.
    1.3 Отфильтруйте массив при помощи созданной функции, избавившись от всех четных чисел и чисел кратных трем. Для
    фильтрации используйте функции, определяющие кратность чисел.
    */
    val numbers = getArrayOfNumbers(1, 100)
    println(filteringOfNumbers(numbers))
}


fun filteringOfNumbers(numbers: List<Int>) =
    numbers.filter { num -> !parityOfNumber(num) && !multipleOfNumberByThree(num) }