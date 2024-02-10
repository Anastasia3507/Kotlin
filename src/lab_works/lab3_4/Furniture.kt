package lab_works.lab3_4


abstract class Furniture(private val material: String) {
    fun infoFurniture() = "The ${javaClass.simpleName} made of $material"
}
