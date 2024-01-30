package lessons

fun main() {
    /* задание 1
    Представьте, что вы владелец розничного магазина и вам необходимо установить стоимость товара в зависимости от его
    количества. До 9 единиц товара включительно цена составляет 1000 рублей за штуку. От 10 до 19 единиц товара
    включительно - 800 руб. шт. И 600 рублей за товар от 20 единиц и выше. Создайте условие при котором цене будет
    присвоено соответсвующее значение. Подсчитайте общую сумму и выведите результат
    на консоль.
     */

    val quantityOfGoods = readln().toInt()
    val price = priceOneProduct(quantityOfGoods)
    println(price * quantityOfGoods)


    /* задание 2
    Создайте три уровня готовности к чрезвычайным ситуациям: A, B и C. Каждая степень должна предусматривать ряд
    мероприятий, причем каждый последующий уровень должен включать в себя мероприятия предыдущих уровней. В зависимости
    от переданного уровня необходимо вывести на консоль все предназначенные мероприятия. При этом минимальный уровень
    готовности — это C, максимальный — A (включает в себя мероприятия уровней B и C).
    В случае возникновения ситуации A необходимо "Выключить все электрические приборы". B - "Закрыть входные двери и
    окна". C - "Соблюдать спокойствие"
     */

    println(getLevelOfDanger(readln()))

    /* задание 3
    Необходимо отсортировать конфеты M&M's по цвету и по начинке. В первую кучку нужно собрать красные конфеты с
    шоколадом внутри. Во вторую кучку соберите все желтые конфеты с орехами. А в третью кучку коричневые с шоколадом и
    зеленые с шоколадом. Нужно реализовать только логику для сортировки конфет.
     */

    val sweets = listOf(
        Sweet("red" to "chocolate"),
        Sweet("green" to "chocolate"),
        Sweet("yellow" to "nut"),
        Sweet("red" to "chocolate"),
        Sweet("brow" to "chocolate"))

    sweets.forEachIndexed { index, sweet ->
        println("$index. Эта конфета цвета - ${sweet.color}, и с начинкой - ${sweet.filling}")
        println(sortingSweets(sweet))
    }
}

fun priceOneProduct(quantityOfGoods: Int) =
    when (quantityOfGoods) {
        in Int.MIN_VALUE..-1 -> 0
        in 0..9 -> 1000
        in 10..19 -> 800
        else -> 600
    }

fun getLevelOfDanger(level: String): String {
    val a = "Выключить все электрические приборы"
    val b = "Закрыть входные двери и окна"
    val c = "Соблюдать спокойствие"
    return when (level) {
        "A" -> a + "\n" + b + "\n" + c
        "B" -> b + "\n" + c
        "C" -> c
        else -> "error"
    }
}

fun sortingSweets(sweet: Sweet) =
    when {
        sweet.color == "red" && sweet.filling == "chocolate" -> "Положите эту конфету в первую кучку"
        sweet.color == "yellow" && sweet.filling == "nut" -> "Положите эту конфету во вторую кучку"
        (sweet.color == "brow" || sweet.color == "green") && sweet.filling == "chocolate" -> "Положите эту конфету в третью кучку"
        else -> "Это не M&Ms"
    }

class Sweet(sweet: Pair<String, String>) {
    val color = sweet.first
    val filling = sweet.second
}