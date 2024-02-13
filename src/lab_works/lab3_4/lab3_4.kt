package lab_works.lab3_4

/* Задание: Создать абстрактный класс, описывающий мебель. С помощью наследования реализовать различные виды мебели.
Протестировать работу классов.
Реализовать интерфейс Priceable, имеющий метод getPrice(), возвращающий некоторую цену для объекта. Проверить работу для
различных классов, сущности которых могут иметь цену.*/

fun main() {
    val table = Table("wood")
    val chair = Chair("plastic", true)

    println(table.infoFurniture())
    println(priceFurniture(table))

    println(chair.infoFurniture())
    println(priceFurniture(chair))

    val chair2 = Chair("wood", false)

    println(chair2.infoFurniture())
    println(priceFurniture(chair2))

    val chair3 = Chair("wood", true)

    println(chair3.infoFurniture())
    println(priceFurniture(chair3))

    // сравнение объектов по свойству material
    println(chair2 == chair3) // true
    println(chair2.hashCode() == chair3.hashCode()) // true
}

fun priceFurniture(price: Priceable) {
    println("Product price = ${price.getPrice()} cucumbers")
}