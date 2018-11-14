package com.mpowloka.structural.decorator.decorators

import com.mpowloka.structural.decorator.shapes.Shape

class SillyPatternDecorator(shape: Shape): ShapeDecorator(shape) {

    override fun getDescription(): String {
        return super.getDescription() + " with silly pattern"
    }

}