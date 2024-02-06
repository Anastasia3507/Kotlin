package lab_works.lab2

class Book(  // не доделала еще
    private val author: String,
    private val name: String,
    private val publisher: String,
    var edition: Int,
    private val publicationYear: Int,
) {
    fun getInfoBook() = "Книга - $name, автор - $author"

    fun publicationInfo() = "Издатель - $publisher, год публикации - $publicationYear г., тираж - $edition экз."
}