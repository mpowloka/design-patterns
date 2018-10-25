package com.mpowloka.structural.bridge.engine

class Diesel : Engine {
    override fun start() = println("*Diesel noise*")

    override fun providePower() = println("Wrrrrrrrrruuuuum")
}