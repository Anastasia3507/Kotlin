package lessons.lesson_7

fun main() {
    /* Задание 1
    1.1 Создайте базовый класс Shape со следующими вычисляемыми свойствами: square: Double, perimeter: Double,
    description: String
    Свойство description должно возвращать сообщение следующего вида: «Square of shape <...> is <...>. Perimeter - <...>»
    1.2. Создайте классы Circle и Rectangle, унаследовав их от Shape. Переопределите свойства square и perimeter для
    каждого класса в соответствии с правилом расчета площади и периметра (длины) конкретной фигуры.
    1.3. Создайте класс Ellipse, унаследовав его от Rectangle. Переопределите свойства square и perimeter в соответствии
    с правилом расчета площади и периметра эллипса (для расчета нужно использовать ширину и высоту).
    1.4 Создайте по экземпляру каждого класса, кроме Shape и выведите значение свойства description на консоль.
    */
    val circle = Circle(5.0)
    val rectangle = Rectangle(7.0, 3.0)
    val ellipse = Ellipse(9.2, 4.1)
    println(circle.description)
    println(rectangle.description)
    println(ellipse.description)

}

