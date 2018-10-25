package com.mpowloka.structural.bridge.vehicle

import com.mpowloka.structural.bridge.engine.Engine

class Car(
        private val engine: Engine
) : Vehicle() {
    init {
        engine.start()
    }

    override fun move() {
        engine.providePower()
        println("Car driving with ${engine::class.java.simpleName} engine!")
    }

}