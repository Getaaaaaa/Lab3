import java.util.*

fun main() {

    val Vito = Person(Fio("Vito  Scalleta"), 21, "man", Passport("6018", "156765"))

    val Joe = Person(Fio("Joe Barbara"), 26, "female", Passport("6017", "273456"))

    val Genri = Person(
        Fio("Genri"), 20, "man", Passport("6019", "145768"),
        listOf(Duty("worker", 2, 90654, "intern")).toMutableList()
    )
    println("нажмите 1 чтобы добавить должность")
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()


    when (a){
        1 -> Joe.addDuty(Duty("is an employee for a sushi",2, 90762, "cashier"))
    }
    println("должность добавлена: $Joe")

    println("Нажмите 2 чтобы удалить должность")
    val b = scan.nextInt()
    when (b){
        2 -> Joe.deleteDuty("cashier")
    }
    println("удалена должность для: $Joe")

    val process = Scanner(System.`in`)
    println("вы хотите добавить нового работника?? \n 1 - да, 2 - нет")
    val c = process.nextInt()
    when (c){
        1 -> println("добавлен новый работник:")
        2 -> return

    }

    process.nextLine()
    println("введите полное имя человека, которого вы хотите добавить")
    var Fio = process.nextLine()
    println("укажите возраст")
    var Age = process.nextInt()

    process.nextLine()
    println("укажите пол")
    var Floor = process.nextLine()

    println("укажите серию пасспорта")
    var Series  = process.nextLine()

    println("укажите номер пасспорта")
    var Num  = process.nextLine()

    val Person = Person(Fio(Fio),Age,Floor,Passport(Series,Num))
    println("новый работник добавлен: \n $Person")
}