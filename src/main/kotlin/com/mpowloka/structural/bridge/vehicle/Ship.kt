package com.mpowloka.structural.bridge.vehicle

import com.mpowloka.structural.bridge.engine.Engine

class Ship(
        private val engine: Engine
) : Vehicle()  {

    override fun move() {
        engine.start()
        engine.providePower()
        println("Ship goes using ${engine::class.java.simpleName} engine!")
    }

}