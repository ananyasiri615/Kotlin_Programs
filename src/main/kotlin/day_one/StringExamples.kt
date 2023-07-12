package day_one

fun main(args: Array<String>){
    var name = "Meera"

    var surname :String

    surname = "Kumari"

    println(name+ " " + surname)
    println("Alphabet at index zero"+ name[0])
    println("Alphabet iat index "+name[2])
    println("length of the name: "+name.length)
    println(name.uppercase())
    println(name.lowercase())

    var name1 = "Shahidaaaaaaaa"
    var name2 = "Shahid"

    println(name1.compareTo(name2))

    println(name1.indexOf("ahi"))
    println(name.plus(" ").plus(surname))

    println(" "+name.get(3))
    println(" "+name.subSequence(1,4))

    var text1 = "Welcome to "
    var text2 = "Kotlin programming language"

    println("$text1 $text2. IT will be fun learning it.")

    var isKotlinEasyThanJava : Boolean
    isKotlinEasyThanJava = true

    println("Is learning kotlin is easier compared to java? $isKotlinEasyThanJava")
    val a = 100
    val b = 200

    println(b>a)
    println(b == 100)
}