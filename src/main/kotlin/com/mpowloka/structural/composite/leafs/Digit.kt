package com.mpowloka.structural.composite.leafs

import com.mpowloka.structural.composite.common.SimpleGlyph

class Digit(content: String) : SimpleGlyph() {

    private val content: String = if(content.matches("[0-9]".toRegex())) {
        content
    } else {
        throw IllegalArgumentException("$TAG Given string is not a digit")
    }



    override fun content() = content

    companion object {

        private const val TAG = "Digit:"

    }

}