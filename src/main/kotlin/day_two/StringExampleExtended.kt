package day_two

fun main(args: Array<String>) {

//below is example of escaped string
    var name1 = "\"Arjun\" \nKumar \tSingh"

    println(name1)

//below is example of raw String
    var text1 = """
This is a sample
text
an example of raw string 
""".trimIndent()
    println(text1)


// == is used to comapre string based on their values
//=== is used to compare the references of the string objects

    var name2 = "Shahid"
    var name3 = "Shahid"
    println(name2 === name3)

    var name4 = buildString { "Vivek" }
    var name5 = buildString { "Vivek" }

    println(name4 === name5)
}

