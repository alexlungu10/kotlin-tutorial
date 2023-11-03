package com.kotlin.tutorial.examples

sealed interface Vehicle {
    val name: String

//    fun start() //todo uncomment me

}

data class Car(
    override val name: String,
    val engineHorsePower: Int,
    val airbagSize: String,
) : Vehicle {}

data class AirPlane(
    override val name: String,
    val wings: Int,
) : Vehicle {}

data class WindBoat(
    override val name: String,
    val anchorSize: Int,
    val fishingNetCount: Int,
) : Vehicle {}

fun main() {
    val car: Vehicle = Car(name = "VW Passat", engineHorsePower = 300, airbagSize = "MEDIUM") //  key value args
    val airplane: Vehicle = AirPlane(name = "Boeng 747", wings = 2)
    val airplane2: AirPlane = (airplane as AirPlane).copy(name = "Concorde 303")

    val boat: Vehicle = WindBoat(name = "Far Light Wind Boat", anchorSize = 3, 5)

    listOf(car, airplane, airplane2, boat).forEach { describeVehicle(it) }

}

fun describeVehicle(vehicle: Vehicle) {
    when (vehicle) {
        is AirPlane -> {
            println("Airplane, name: ${vehicle.name}")
            println("wings: ${vehicle.wings}")
            println("................")
        }

        is Car -> {
            println("Car, name: ${vehicle.name}")
            println("engineHorsePower: ${vehicle.engineHorsePower}")
            println("airbagSize: ${vehicle.airbagSize}")
            println("................")

        }

        is WindBoat -> {
            println("Boat, name: ${vehicle.name}")
            println("fishingNetCount: ${vehicle.fishingNetCount}")
            println("................")

        }
    }
}
