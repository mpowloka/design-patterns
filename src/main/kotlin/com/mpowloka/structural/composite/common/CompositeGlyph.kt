package com.mpowloka.structural.composite.common

abstract class CompositeGlyph : Glyph {

    abstract val collection: MutableCollection<Glyph>

    override fun add(glyph: Glyph) = collection.add(glyph)

    override fun remove(glyph: Glyph) = collection.remove(glyph)

}