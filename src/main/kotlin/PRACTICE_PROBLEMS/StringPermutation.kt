import java.util.Scanner

//fun Permutations(str: String, emptyStr: String = "") {
//    if (str.isEmpty()) {
//        println(emptyStr)
//        return
//    }
//    for (i in str.indices) {
//        val Char = str[i]
//        val remaining = str.removeRange(i, i + 1)
//        Permutations (remaining, emptyStr+Char)
//    }
//}
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    var str = sc.nextLine()
//    Permutations (str)
//}


fun permutations(
    str: String,
    usedChars: BooleanArray,
    emptyStr: String = "",
    printedPermutations: HashSet<String> = HashSet()
) {
    if (emptyStr.length == str.length) {
        if (!printedPermutations.contains(emptyStr)) {
            println(emptyStr)
            printedPermutations . add (emptyStr)
        }
        return
    }
    for (i in str.indices) {
        if (!usedChars[i]) {
            usedChars[i] = true
            val char = str[i]
            permutations (str, usedChars, emptyStr+char, printedPermutations)
            usedChars[i] = false
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    var str = sc.nextLine()
    val usedChars = BooleanArray(str.length)
    permutations (str, usedChars)
}
