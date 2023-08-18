package com.designpatterns.structural.flyweight;

import java.awt.*;

// Concrete Flyweight (Square)
public class Square implements Shape {
    private final Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " square at (" + x + ", " + y + ")");
    }
}
