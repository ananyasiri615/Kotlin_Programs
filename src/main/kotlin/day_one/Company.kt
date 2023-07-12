package day_one

class Company {

    var id = 101
    var name = "Infosys"
    var typeOfCompany = "Software"
}

fun main(args: Array<String>) {
    val c1 = Company()

    println("id : ${c1.id}, name : ${c1.name}, typeOfCompany : ${c1.typeOfCompany}")

    var c2 = Company()

    c2.id = 102
    c2.name = "Tata Motors"
    c2.typeOfCompany = "Automobile"

    println("id : ${c2.id}, name : ${c2.name}, typeOfCompany : ${c2.typeOfCompany}")
}