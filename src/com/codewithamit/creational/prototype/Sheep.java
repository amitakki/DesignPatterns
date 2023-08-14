package com.codewithamit.creational.prototype;

public class Sheep implements AnimalPrototype {

    private final String name;

    Sheep(String name) {
        this.name = name;
    }

    @Override
    public AnimalPrototype clone() {
        return new Sheep(name);
    }

    @Override
    public String toString() {
        return "Sheep named " + name;
    }
}
