package com.mpowloka.structural.composite.leafs

import com.mpowloka.structural.composite.common.SimpleGlyph

class Symbol(content: String) : SimpleGlyph() {

    private val content: String = if(content.matches("[_\\-$@,.!?:;><'\"\\\\|\\]\\[{}+=/*&^%# ]".toRegex())) {
        content
    } else {
        throw IllegalArgumentException("$TAG Given string is not an available symbol")
    }



    override fun content() = content

    companion object {

        private const val TAG = "Symbol:"

    }

}