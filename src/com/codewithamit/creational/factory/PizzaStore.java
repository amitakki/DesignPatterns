package com.codewithamit.creational.factory;

public class PizzaStore {
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Sorry, we don't have this type of pizza.");
        }
        return pizza;
    }
}
