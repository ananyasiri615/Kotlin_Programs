package day_one

fun main(args: Array<String>) {
    var genre = "Action"

    var result = when(genre) {
        "Action" -> "TIger Shorff"
        "Romance" -> " Shah Rukh Khan"
        "Comedy" -> "Akshay Kumar"
        "Drama" -> "Ranveer Singh"
        else -> "No match found"
    }
    println(result)

}