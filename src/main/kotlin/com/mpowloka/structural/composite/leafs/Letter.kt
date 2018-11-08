package com.mpowloka.structural.composite.leafs

import com.mpowloka.structural.composite.common.SimpleGlyph

class Letter(content: String) : SimpleGlyph() {

    private val content: String = if(content.matches("[a-zA-Z]".toRegex())) {
        content
    } else {
        throw IllegalArgumentException("$TAG Given string is not a letter")
    }



    override fun content() = content

    companion object {

        private const val TAG = "Letter:"

    }

}