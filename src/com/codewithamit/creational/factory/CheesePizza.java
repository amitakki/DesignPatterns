package com.codewithamit.creational.factory;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing the Cheese Pizza.");
    }
}
