package lab_works.lab2

// Создать класс, описывающий книгу (Book). В классе должны быть описаны нужные свойства книги(автор, название, год
// написания и т. д.)и методы для получения, изменения этих свойств.
class Book(
    private val author: String,
    private val name: String,
    private val publisher: String,
    var edition: Int,
    private val publicationYear: Int,
) {
    fun getInfoBook() = "Книга - $name, автор - $author"

    fun publicationInfo() = "Издатель - $publisher, год публикации - $publicationYear г., тираж - $edition экз."
}