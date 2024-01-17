import kotlin.random.Random
fun main() {
    // создание массива с рандомными числами
    val randomValues = Array<Int>(10){Random.nextInt()}
    var result = ""
    randomValues.forEach(){
        result += "$it,"
    }
    println("[${result.substring(0,result.count()-1)}]")

    // сортировка по возрастанию
    randomValues.sort()
    var result2 = ""
    randomValues.forEach(){
        result2 += "$it,"
    }
    println("[${result2.substring(0,result2.count()-1)}]")
}