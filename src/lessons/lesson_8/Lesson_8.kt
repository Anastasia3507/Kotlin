package lessons.lesson_8

fun main() {
    /* Задание 1
    1.1 Создайте перечисление CalculationType, содержащее четыре математических действия — *сложение*, *вычитание*,
    *умножение* и *деление*.
    1.2 Напишите функцию возвращающую Int и принимающую в качестве параметров три значения: число один, число два и
    тип математической операции. Внутри функции, в зависимости от значения параметра CalculationType выполните
    соответствующую математическую операцию со значениями и верните результат. Реализуйте функцию таким образом, что бы
    при каждом её вызове на консоль выводилось сообщение следующего содержания: «Результат сложения (вычитания, деления,
    умножения) <…> и <…> равен <…>».
    1.3 Вызовите эту функцию четыре раза для каждого математического оператора в отдельности.*/

    println(mathematicalOperation(3, 4, CalculationType.ADDITION))
    println(mathematicalOperation(9, 3, CalculationType.SUBTRACTION))
    println(mathematicalOperation(2, 7, CalculationType.MULTIPLICATION))
    println(mathematicalOperation(6, 2, CalculationType.DIVISION))

    /* Задание 2
    2.1 Создайте перечисление DistanceUnit (Единица измерения расстояния) со следующими кейсами: versta, kilometer, mile.
    Внутри перечисления DistanceUnit создайте еще одно перечисление NonISUCountry в котором содержится перечень стран не
    принявших международную систему единиц (США, Либерия и Мьянма).
    Верста и километр должны иметь ассоциативный параметры следующего типа: (title: String, denotation: String,
    countries: [String]). Миля - (title: String, denotation: String, countries: [NonISUCountry]). Первый параметр - это
    название единицы измерения, второй параметр отвечает за обозначение единицы, а массив должен содержать перечень
    стран в которых используется эта единица (для километра не обязательно перечислять все страны).
    */

    /*:
    2.2 Создайте по экземпляру DistanceUnit для каждого кейса и функцию, которая должна принимать единицу измерения и выводить на консоль информацию о ней, например: "Километр. Краткое наименование: км. Страны: Россия, Евросоюз".
    */
}

fun mathematicalOperation(number1: Int, number2: Int, operation: CalculationType) =
    when (operation) {
        CalculationType.ADDITION -> "Результат ${CalculationType.ADDITION.operation} $number1 и $number2 равен ${number1 + number2}"
        CalculationType.SUBTRACTION -> "Результат ${CalculationType.SUBTRACTION.operation} $number1 и $number2 равен ${number1 - number2}"
        CalculationType.MULTIPLICATION -> "Результат ${CalculationType.MULTIPLICATION.operation} $number1 и $number2 равен ${number1 * number2}"
        CalculationType.DIVISION -> "Результат ${CalculationType.DIVISION.operation} $number1 и $number2 равен ${number1 / number2}"
    }