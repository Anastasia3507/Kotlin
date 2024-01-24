package lessons

fun main(){
    // задание 1
    val quantityOfGoods = readln().toInt()
    val price = if(quantityOfGoods <= 9){
        1000
    } else if (quantityOfGoods in 10..19){
        800
    } else {
        600
    }
    println(price * quantityOfGoods)

    // задание 2

}
