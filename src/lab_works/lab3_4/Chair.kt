package lab_works.lab3_4

class Chair(private val material: String, private val backOfChair: Boolean) : Furniture(material), Priceable {
    private val price: Double
        get() = if (material == "wood") 900.0 else 700.0

    override fun getPrice() {
        if (backOfChair) price + 100
        println("Product price = $price cucumbers")
    }
}