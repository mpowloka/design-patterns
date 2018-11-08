package com.mpowloka.structural.composite.composites

import com.mpowloka.structural.composite.common.CompositeGlyph
import com.mpowloka.structural.composite.common.Glyph

class Column(
        override val collection: MutableList<Glyph> = mutableListOf()
) : CompositeGlyph() {

    override fun content(): String {
        val stringBuilder = StringBuilder()
        collection.forEach {
            stringBuilder.append(it.content())
            stringBuilder.append("\n")
        }
        return stringBuilder.toString()
    }

    override fun getChild(position: Int) = collection[position]
}