package lab_works.lab3_4

class Chair(override val material: String, private val backOfChair: Boolean) : Furniture(), Priceable {
    override val price: Double
        get() = if (material == "wood") 900.0 else 700.0
    override fun getPrice(price: Double) {
        if (backOfChair) price + 100
        println("Product price = $price cucumbers")
    }
}