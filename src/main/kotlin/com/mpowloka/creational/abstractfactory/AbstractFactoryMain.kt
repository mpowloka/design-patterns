package com.mpowloka.creational.abstractfactory

fun main(args: Array<String>) {

    environment(Environment.SEA)

    environment(Environment.LAND)
}


fun environment(environment: Environment) {
    println("$environment:")
    val factory = AbstractFactory(environment)
    factory.getBreathingEquipment().breath()
    factory.getSeeingEquipment().look()
    println()
}

