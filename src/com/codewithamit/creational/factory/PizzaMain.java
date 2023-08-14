package com.codewithamit.creational.factory;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        Pizza cheesePizza = pizzaStore.orderPizza(PizzaType.CHEESE);

        System.out.println();

        Pizza pepperoniPizza = pizzaStore.orderPizza(PizzaType.PEPPERONI);

        System.out.println();

        Pizza veggiePizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
    }
}