package com.mpowloka.structural.decorator.decorators

import com.mpowloka.structural.decorator.shapes.Shape

class ShinyBordersDecorator(shape: Shape) : ShapeDecorator(shape) {

    override fun getDescription(): String {
        return super.getDescription() + " with shiny borders"
    }
}