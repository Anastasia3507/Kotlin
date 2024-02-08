package lab_works.lab3_4

class Table(private val material: String) : Furniture(material), Priceable {
    private val price: Double
        get() = if (material == "wood") 1000.0 else 800.0

    override fun getPrice() {
        println("Product price = $price cucumbers")
    }
}