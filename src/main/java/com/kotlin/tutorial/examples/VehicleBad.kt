package com.kotlin.workshop.kotlin.tutorial

data class BadVehicle(
// class BadVehicle(  //todo uncomment me and use the println, no lombok needed
    val name: String,
    val airbagSize: String?,
    val wings: Int?,
    val engineHorsePower: Int?,
    val hasEngine: Boolean,
    val hasAnchor: Boolean,
    val fishingNetCount: Int?,
    val anchorSize: Int? = null,// default values

) {

    fun describeVehicle() {

        //airplane
        if (hasEngine && wings != null && wings >= 1) {
            println("Airplane, name: $name")
            println("wings: $wings")
        }

        //car
        else if (hasEngine && airbagSize != null) {
            println("Car, name: $name")

            if (engineHorsePower != null) {
                println("engineHorsePower: $engineHorsePower")
            }
            if (airbagSize != null) {
                println("airbagSize: $airbagSize")
            }

        }


        //boat
        else if (hasAnchor) {
            println("Boat, name: $name")
            if (fishingNetCount != null) {
                println("fishingNetCount: $fishingNetCount")
            }


        }


        println("............")

    }
}


fun main() {
    val car = BadVehicle("VW Passat", "MEDIUM", null, 300, true, false, null)
    val airplane = BadVehicle("Boeng 747", null, 2, 600, true, false, null)
    val boat = BadVehicle("Far Light Wind Boat", null, null, null, false, true, 3)

    listOf(car, airplane, boat).forEach { it.describeVehicle() }

}

