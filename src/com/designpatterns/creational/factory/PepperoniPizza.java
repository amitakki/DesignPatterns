package com.designpatterns.creational.factory;

public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza.");
    }
}
