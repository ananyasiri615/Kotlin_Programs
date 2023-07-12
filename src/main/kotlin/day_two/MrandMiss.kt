package day_two

fun Prefixadd(name: String): String {
    val prefix = { n: String ->
        if (n.endsWith('A', true)) {
            "Miss $n"
        } else {
            "Mr $n"
        }
    }
    return prefix(name)
}

fun main(args: Array<String>) {
    val names = arrayOf("Ananya", "Akshay", "Siddharth", "Kruthika")
    for (n in names) {
        val Name = Prefixadd(n)
        println(Name)
    }
}
