package day_three

class Books (id: Int, name: String, price: Double) {

    var id: Int
    var name: String
    var price: Double

    init{
        this.id = id
        this.name = name
        this.price = price
    }
    override fun toString(): String {
        return "Books(id=$id, name='$name', price=$price)"
    }
}

fun main(args: Array<String>) {

    var books = mutableListOf<Books>(Books(101, "Learn Java", 1000.30),
        Books(101, "Learn Kotlin", 965.30),
        Books(101, "Learn Hibernate", 876.50)
    )

    books.forEach{ println(it) }

}

