package day_four

interface LivingBeing{
    fun eat()
    fun walk()
    fun  communicate()
}

class Human: LivingBeing {
    override fun eat() {
        println("Humans eat using hands.")
    }

    override fun walk() {
        println("Humans walk on two legs.")
    }

    override fun communicate() {
        println("Humans communicate using language.")
    }
}

class Animal: LivingBeing {
    override fun eat() {
        println("Animals eat without using hands.")
    }

    override fun walk() {
        println("Animals walk on four legs.")
    }

    override fun communicate() {
        println("Animals communicate using gestures and emotions.")
    }
}

fun main(args: Array<String>) {
    val obj = Human()
    obj.eat()
    obj.walk()
    obj.communicate()

    val o = Animal()
    o.eat()
    o.walk()
    o.communicate()
}