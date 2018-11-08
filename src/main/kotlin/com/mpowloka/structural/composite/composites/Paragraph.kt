package com.mpowloka.structural.composite.composites

import com.mpowloka.structural.composite.common.CompositeGlyph
import com.mpowloka.structural.composite.common.Glyph

class Paragraph(
        override val collection: MutableList<Glyph> = mutableListOf()
) : CompositeGlyph() {

    override fun content(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("\t")
        collection.forEach {
            stringBuilder.append(it.content())
        }
        return stringBuilder.toString()
    }

    override fun getChild(position: Int) = collection[position]

}