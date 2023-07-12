package day_two

fun myFunction(name: String, surName: String, fullName: (String, String) -> String ):Unit {

    var result = fullName(name, surName)
    println(result)
}

fun main(args: Array<String>) {

    val fullName:(String, String) -> String={name, surName -> "Full name is $name $surName"}
    myFunction("Sachin", "Tendulkar", fullName)
    //myFunctionTwo("Java Training School", ::demo)
}

fun myFunctionTwo(str: String, organisationName: (String)-> Unit){
    print("Welcome To ")
    organisationName(str)
}

fun demo(str: String){
    println(str.uppercase())
}