package com.mpowloka.structural.decorator

import com.mpowloka.structural.decorator.decorators.ColorfulFillingDecorator
import com.mpowloka.structural.decorator.decorators.ShinyBordersDecorator
import com.mpowloka.structural.decorator.decorators.SillyPatternDecorator
import com.mpowloka.structural.decorator.shapes.Circle
import com.mpowloka.structural.decorator.shapes.Shape
import com.mpowloka.structural.decorator.shapes.Square
import com.mpowloka.structural.decorator.shapes.Triangle


fun main(args: Array<String>) {

    println(getTriangleWithSillyPatternThatHasShinyBorder().getDescription() + "\n")

    println(getCircleWithSillyPatternThatHasShinyBorderThatHasColorfulFilling().getDescription() + "\n")

    println(getSquareWithColorfulFilling().getDescription() + "\n")

}

fun getTriangleWithSillyPatternThatHasShinyBorder(): Shape {
    return ShinyBordersDecorator(
            SillyPatternDecorator(
                    Triangle()
            )
    )
}

fun getCircleWithSillyPatternThatHasShinyBorderThatHasColorfulFilling(): Shape {
    return SillyPatternDecorator(
            ShinyBordersDecorator(
                    ColorfulFillingDecorator(
                            Circle()
                    )
            )
    )
}

fun getSquareWithColorfulFilling(): Shape {
    return ColorfulFillingDecorator(
            Square()
    )
}