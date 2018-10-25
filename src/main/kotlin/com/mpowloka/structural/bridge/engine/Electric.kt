package com.mpowloka.structural.bridge.engine

class Electric : Engine {
    override fun start() = println("*Electric silence*")

    override fun providePower() = println("Continues electric silence")
}