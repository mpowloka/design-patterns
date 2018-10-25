package com.mpowloka.structural.bridge

import com.mpowloka.structural.bridge.engine.Diesel
import com.mpowloka.structural.bridge.engine.Electric
import com.mpowloka.structural.bridge.engine.Gas
import com.mpowloka.structural.bridge.vehicle.Car
import com.mpowloka.structural.bridge.vehicle.Ship

fun main(args: Array<String>) {
    tesla()

    humvee()

    tanker()

    speedBoat()
}

fun humvee() {
    val humvee = Car(Gas())
    humvee.move()
    println()
}

fun tesla() {
    val tesla = Car(Electric())
    tesla.move()
    println()
}

fun tanker() {
    val tanker = Ship(Diesel())
    tanker.move()
    println()
}

fun speedBoat() {
    val speedBoat = Ship(Electric())
    speedBoat.move()
    println()
}
