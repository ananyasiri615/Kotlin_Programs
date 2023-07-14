package day_four

interface A {

    fun display(){
        println("Display function of A interface")
    }
}

interface B {
    fun display(){
        println("Display function of B interface")
    }

    fun displayDefault(){
        println("Display default function")
    }
}

class ABImpl : A, B {
    override fun display() {
        //super<A>.display()
        println("Display function of ABIMPL")
    }
}

fun main(args: Array<String>) {

    val obj = ABImpl()

    obj.display()

    obj.displayDefault()
}

