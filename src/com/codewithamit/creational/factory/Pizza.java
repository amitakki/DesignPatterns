package com.codewithamit.creational.factory;

abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking the " + name + " pizza." );
    }

    public void cut() {
        System.out.println("Cutting the " + name + " pizza.");
    }

    public void box() {
        System.out.println("Boxing the " + name + " pizza.");
    }
}
