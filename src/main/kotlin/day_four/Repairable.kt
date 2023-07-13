package day_four

interface Repairable{
    val service_charge : Int

    fun repair():Int
}

class Car : Repairable {
    override val service_charge :Int = 100
    override fun repair(): Int {
        println("The car has been repaired successfully.")

        val repairingCharges = 500

        val totalChargesCar = repairingCharges + service_charge

        return totalChargesCar

    }
}

class Toy : Repairable {
    override val service_charge :Int = 100
    override fun repair(): Int {
        println("The toy has been repaired.")

        val totalChargesToy = 100 + service_charge

        return totalChargesToy
    }
}

fun main(args: Array<String>) {
    val c1 = Car()
    val totalChargesCar = c1.repair()

    println("Total Charges = $totalChargesCar. Please pay and take your car home.")

    val t1 = Toy()
    val totalChargesToy = t1.repair()

    println("Total Charges = $totalChargesToy. Please pay and take your toy home.")
}
