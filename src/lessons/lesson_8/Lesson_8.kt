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

    mathematicalOperation(3, 4, CalculationType.ADDITION)
    mathematicalOperation(9, 3, CalculationType.SUBTRACTION)
    mathematicalOperation(2, 7, CalculationType.MULTIPLICATION)
    mathematicalOperation(6, 2, CalculationType.DIVISION)

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
    2.2 Создайте по экземпляру DistanceUnit для каждого кейса и функцию, которая должна принимать единицу измерения и
    выводить на консоль информацию о ней, например: "Километр. Краткое наименование: км. Страны: Россия, Евросоюз".
    */

    //тут есть вопросы
    getInfoUnit(DistanceUnit.VERSTA)
    getInfoUnit(DistanceUnit.KILOMETER)
    getInfoUnit(DistanceUnit.MILE)
}

fun mathematicalOperation(number1: Int, number2: Int, operation: CalculationType): Int {
    val result: Int
    when (operation) {
        CalculationType.ADDITION -> {
            result = number1 + number2
            println("Результат ${CalculationType.ADDITION.operation} $number1 и $number2 равен $result")
            return result
        }

        CalculationType.SUBTRACTION -> {
            result = number1 - number2
            println("Результат ${CalculationType.SUBTRACTION.operation} $number1 и $number2 равен $result")
            return result
        }

        CalculationType.MULTIPLICATION -> {
            result = number1 * number2
            println("Результат ${CalculationType.MULTIPLICATION.operation} $number1 и $number2 равен $result")
            return result
        }

        CalculationType.DIVISION -> {
            result = number1 / number2
            println("Результат ${CalculationType.DIVISION.operation} $number1 и $number2 равен $result")
            return result
        }
    }
}

fun getInfoUnit(unit: DistanceUnit) =
    when (unit) {
        DistanceUnit.VERSTA -> println("${DistanceUnit.VERSTA.title}. Краткое наименование: ${DistanceUnit.VERSTA.denotation}. Страны: ${DistanceUnit.VERSTA.countries}")
        DistanceUnit.KILOMETER -> println("${DistanceUnit.KILOMETER.title}. Краткое наименование: ${DistanceUnit.KILOMETER.denotation}. Страны: ${DistanceUnit.KILOMETER.countries}")
        DistanceUnit.MILE -> println("${DistanceUnit.MILE.title}. Краткое наименование: ${DistanceUnit.MILE.denotation}. Страны: ${DistanceUnit.MILE.countries}")
    }