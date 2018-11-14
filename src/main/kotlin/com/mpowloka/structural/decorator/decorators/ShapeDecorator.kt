package com.mpowloka.structural.decorator.decorators

import com.mpowloka.structural.decorator.shapes.Shape


abstract class ShapeDecorator(protected val shape: Shape) : Shape {

    override fun getDescription() = shape.getDescription()

}