package lab_works.lab3_4

/* Задание: Создать абстрактный класс, описывающий мебель. С помощью наследования реализовать различные виды мебели. Также создать
класс FurnitureShop, моделирующий магазин мебели. Протестировать работу классов.
Реализовать интерфейс Priceable, имеющий метод getPrice(), возвращающий некоторую цену для объекта. Проверить работу для
различных классов, сущности которых могут иметь цену.*/

fun main() {
    val table = Table("wood")
    val chair = Chair("plastic", true)

    println(table.infoFurniture())
    println(table.price)

    println(chair.infoFurniture())
    println(chair.price)

    val chair2 = Chair("wood", false)

    println(chair2.infoFurniture())
    //println(chair2.getPrice())
}