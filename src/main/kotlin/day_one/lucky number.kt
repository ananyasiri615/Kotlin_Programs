package day_one

fun main(args: Array<String>) {
    val name = "Ananya R Siri"

    val totalCharacters = name.length
    var vowelsCount = 0
    for (i in 0 until totalCharacters) {
        val character = name[i]
        if (isVowel(character)) {
            vowelsCount++
        }
    }

    val luckyNumber = totalCharacters - vowelsCount
    println("Your lucky number is: $luckyNumber")
}

fun isVowel(character: Char): Boolean {
    return when (character.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
}
