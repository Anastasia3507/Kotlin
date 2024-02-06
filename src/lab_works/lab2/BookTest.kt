package lab_works.lab2

class BookTest {
    fun main() {
        val book1 = Book("Л.Н.Толстой", "Война и мир", "ЭКСМО", 2000, 2018)
        println(book1.getInfoBook())
        println(book1.publicationInfo())

        book1.edition = 3000
        println(book1.publicationInfo())
    }
}
