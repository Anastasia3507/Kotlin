package lessons

fun main() {
    // задание 1
    val quantityOfGoods = readln().toInt()
    val price = if(quantityOfGoods < 0){
        0
    } else if (quantityOfGoods <= 9){
        1000
    } else if (quantityOfGoods in 10..19){
        800
    } else {
        600
    }
    println(price * quantityOfGoods)

    // задание 2
    println(getLevelOfDanger(readln()))

    // задание 3

}

fun getLevelOfDanger(level: String) =
    when (level) {
        "A" -> "Выключить все электрические приборы" +
                "Закрыть входные двери и окна" +
                "Соблюдать спокойствие"
        "B" -> "Закрыть входные двери и окна" +
                "Соблюдать спокойствие"
        "C" -> "Соблюдать спокойствие"
        else -> "error"
    }

fun sorting(color: String, filling: String) =
    when (color) {
        "red", (filling == "chocolate").toString() -> ""
        "yellow", (filling == "nut").toString() -> ""
        "brow", "green", (filling == "chocolate").toString() -> ""
        else -> ""
    }
