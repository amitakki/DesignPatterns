package com.designpatterns.structural.flyweight;

import java.awt.*;

// Concrete Flyweight (Circle)
public class Circle implements Shape {
    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ")");
    }
}
