package com.codewithamit.creational.factory;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE ->  new CheesePizza();
            case PEPPERONI -> new PepperoniPizza();
            case VEGGIE -> new VeggiePizza();
        };
    }
}