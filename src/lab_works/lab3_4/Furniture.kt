package lab_works.lab3_4

//Если ты хочешь переменные в абстрактных классах, то укажи их как обязательное поле в конструкторе.
//На практике я не видел таких переменных.
abstract class Furniture(private val material: String) {
    fun infoFurniture() = "The ${javaClass.simpleName} made of $material"
}
