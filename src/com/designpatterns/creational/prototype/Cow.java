package com.designpatterns.creational.prototype;

public class Cow implements AnimalPrototype {

    private final String name;

    Cow(String name) {
        this.name = name;
    }


    @Override
    public AnimalPrototype clone() {
        return new Cow(name);
    }

    @Override
    public String toString() {
        return "Cow named " + name;
    }
}
