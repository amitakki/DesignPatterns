package com.designpatterns.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class ShapeFactory {
    private final Map<ColorShapePair, Shape> shapes = new HashMap<>();

    enum ShapeType {
        CIRCLE,
        SQUARE
    }

    public Shape getShape(Color color, ShapeType type) {
        ColorShapePair key = new ColorShapePair(color, type);
        if (!shapes.containsKey(key)) {
            Shape shape = type == ShapeType.CIRCLE ? new Circle(color) : new Square(color);
            shapes.put(key, shape);
        }
        return shapes.get(key);
    }

    private record ColorShapePair(Color color, ShapeType shapeType){ }
}

