package com.mpowloka.structural.decorator.decorators

import com.mpowloka.structural.decorator.shapes.Shape

class ColorfulFillingDecorator(shape: Shape): ShapeDecorator(shape) {

    override fun getDescription(): String {
        return super.getDescription() + " with colorful filling"
    }

}