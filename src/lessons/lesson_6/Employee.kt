package lessons.lesson_6

class Employee(
    val salary: Int,
    val name: String,
    val surname: String,
) {
    override fun toString(): String {
        return "$name $surname’s salary is $$salary"
    }
}