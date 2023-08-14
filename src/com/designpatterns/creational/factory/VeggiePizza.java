package com.designpatterns.creational.factory;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = "Veggie";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza.");
    }
}
