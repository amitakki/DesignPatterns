package com.designpatterns.structural.flyweight;

import java.awt.*;


// Client Code
public class FlyWeightMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape redCircle = shapeFactory.getShape(Color.RED, ShapeFactory.ShapeType.CIRCLE);
        Shape blueSquare = shapeFactory.getShape(Color.BLUE, ShapeFactory.ShapeType.SQUARE);
        Shape redCircleAgain = shapeFactory.getShape(Color.RED, ShapeFactory.ShapeType.CIRCLE);

        // new object red circle
        redCircle.draw(10, 20);
        System.out.println(redCircle);
        System.out.println();

        // new object blue square
        blueSquare.draw(30, 40);
        System.out.println(blueSquare);
        System.out.println();

        // Should print the same object as redCircle
        redCircleAgain.draw(50, 60);
        System.out.println(redCircleAgain);
        System.out.println();

        System.out.println("Both Red Circles are " + (redCircle == redCircleAgain? "same" : "not same"));
    }
}
