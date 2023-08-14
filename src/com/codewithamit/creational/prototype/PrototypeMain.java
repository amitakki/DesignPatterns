package com.codewithamit.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        AnimalPrototype sheepPrototype = new Sheep("Dolly");
        AnimalPrototype cowPrototype = new Cow("Bessi");

        AnimalPrototype clonedSheep = sheepPrototype.clone();
        AnimalPrototype clonedCow = cowPrototype.clone();

        System.out.println(clonedSheep);
        System.out.println(clonedCow);
    }
}
