package lab_works.lab3_4

abstract class Furniture {
    abstract val material: String
    abstract val price: Double

    fun infoFurniture() = "The ${javaClass.simpleName} made of $material"
}