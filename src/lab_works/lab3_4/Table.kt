package lab_works.lab3_4

class Table(override val material: String) : Furniture(), Priceable {
    override val price: Double
        get() = if (material == "wood") 1000.0 else 800.0
    override fun getPrice(price: Double) {
        println("Product price = $price cucumbers")
    }
}