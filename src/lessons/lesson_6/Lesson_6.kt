 package lessons.lesson_6

import kotlin.random.Random

fun main() {
    /* Задание 1
    1.1 Создайте класс Orange со следующими свойствами: color: String, taste: String, radius: Double
    Необходимо реализовать возможность создания экземпляра класса со значениями по умолчанию для свойств *color* и
    *taste*. Свойство *radius* должно быть обязательным для инициализации, т.е. не должно быть возможности создания
    экземпляра класса без радиуса.
    Объявите геттер *orangeVolume*, возвращающий объем апельсина. При этом расчет объема необходимо реализовать в методе
    *calculateOrangeVolume*.
    Создайте экземпляр класса Orange, вызвав при этом инициализатор только для радиуса. Остальным свойствам, созданного
    экземпляра присвойте следующие значения: color — *Orange*, taste — *Sweet*
    Выведите на консоль сообщение: «Orange has <...> color and <...> taste. The volume of orange is <...>», обращаясь к
    этим значениям через экземпляр класса.
    */

    val fruit = Orange(radius = 5.0)
    println("Orange has ${fruit.color} color and ${fruit.taste} taste. The volume of orange is ${fruit.orangeVolume}")

    /* Задание 2
    2.1 Создайте класс Employee (сотрудник) со следующими свойствами: salary, name, surname
    2.2 Создайте массив names со следующими именами: *John*, *Aaron*, *Tim*, *Ted*, *Steven*. И еще один массив
    surnames со следующими фамилиями: *Smith*, *Dow*, *Isaacson*, *Pennyworth*, *Jankins*. Массивы должны быть созданы
    вне класса.
    2.3 Объявите массив employees и создайте цикл, в котором он заполняется десятью объектами класса Employee таким
    образом, что свойства name и surname инициализируются случайными именами и фамилиями из массивов names и surnames,
    соответственно. Свойство salary (зарплата) тоже должно генерироваться в случайном диапазоне от *$1000* до *$2000*
    2.4 Переберите массив employees и выведите информацию по каждому сотруднику в виде: «<имя> <фамилия>’s salary is
    $<... >»
    */

    val names = mutableListOf("John", "Aaron", "Tim", "Ted", "Steven")
    val surnames = mutableListOf("Smith", "Dow", "Isaacson", "Pennyworth", "Jankins")

    val employees = getListOfEmployees(names, surnames)
    employees.forEach { employee ->
        println("${employee.name} ${employee.surname}’s salary is $${employee.salary}")
    }

    хочу вот так )
    employees.forEach { employee ->
        println(employee)  // (переопредели метод toString())
    }
    /* 2.5 Создайте еще один массив на основе employees, который включает только тех работников, чья зарплата чётная.
    Выведите информацию по каждому сотруднику с четной зарплатой, как в пункте 2.4
     */

    println("\nСотрудники с четной зарплатой:")
    sortListOfEmployees(employees).forEach { employee ->
        println("${employee.name} ${employee.surname}’s salary is $${employee.salary}") дублирование кода !!!
    }


    
}

// расскажи как это работает)
fun getListOfEmployees (name: MutableList<String>, surname: MutableList<String>)= mutableListOf<Employee>().apply {
     repeat (10) {
         this.add(Employee(name = name.random(), surname = surname.random(), salary = Random.nextInt(1000, 2000)))
     }
}

fun getListOfEmployees (name: MutableList<String>, surname: MutableList<String>): MutableList<Employee> {
     val employees = mutableListOf<Employee>()
     for (i in 1..10) { попробуй так repeat() (для разнообразия)
         val salaryRandom = Random.nextInt(1000, 2000)
         employees.add(Employee(name = name.random(), surname = surname.random(), salary = salaryRandom))
     }
     return employees
}

fun sortListOfEmployees (listOfEmployees: MutableList<Employee>) = listOfEmployees.filter { i -> i.salary % 2 == 0 }
