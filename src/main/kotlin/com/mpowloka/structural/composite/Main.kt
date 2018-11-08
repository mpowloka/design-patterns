package com.mpowloka.structural.composite

import com.mpowloka.structural.composite.composites.Column
import com.mpowloka.structural.composite.composites.Paragraph
import com.mpowloka.structural.composite.composites.Row
import com.mpowloka.structural.composite.leafs.Digit
import com.mpowloka.structural.composite.leafs.Letter
import com.mpowloka.structural.composite.leafs.Symbol

fun main(args: Array<String>) {
    println("Funny row:")
    getFunnyRow().draw()

    println("\n\nVery funny column:")
    getVeryFunnyColumn().draw()

    println("\n\nAbsurdly hilarious paragraph:")
    getAbsurdlyHilariousParagraph().draw()
}

fun getAbsurdlyHilariousParagraph() = Paragraph(mutableListOf(
        getVeryFunnyColumn(),
        getVeryFunnyColumn(),
        getVeryFunnyColumn()
))

fun getVeryFunnyColumn() = Column().apply {
    add(getFunnyRow())
    add(getFunnyRow())
    add(getFunnyRow())
    add(getFunnyRow())
    add(getFunnyRow())
    add(getFunnyRow())
    add(getFunnyRow())
    add(getFunnyRow())
    add(getFunnyRow())
    add(getFunnyRow())
}

fun getFunnyRow() = Row(mutableListOf(
        Letter("I"),
        Letter("m"),
        Letter("a"),
        Letter("g"),
        Letter("i"),
        Letter("n"),
        Letter("e"),
        Symbol(" "),
        Letter("a"),
        Symbol(" "),
        Letter("b"),
        Letter("a"),
        Letter("l"),
        Letter("d"),
        Symbol(" "),
        Letter("u"),
        Letter("n"),
        Letter("i"),
        Letter("c"),
        Letter("o"),
        Letter("r"),
        Letter("n"),
        Symbol("!"),
        Symbol("!"),
        Digit("1")
))