package com.mpowloka.structural.composite.common

abstract class SimpleGlyph : Glyph {


    override fun add(glyph: Glyph) = false

    override fun remove(glyph: Glyph) = false

    override fun getChild(position: Int): Glyph? = null
}