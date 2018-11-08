package com.mpowloka.structural.composite.common

interface Glyph {

    fun draw() = print(content())

    fun content(): String



    fun add(glyph: Glyph): Boolean

    fun remove(glyph: Glyph): Boolean

    fun getChild(position: Int): Glyph?

}