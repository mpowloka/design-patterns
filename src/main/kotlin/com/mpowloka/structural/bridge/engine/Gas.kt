package com.mpowloka.structural.bridge.engine

class Gas : Engine {
    override fun start() = println("*Gas noise*")

    override fun providePower() = println("Gas gas gas")
}