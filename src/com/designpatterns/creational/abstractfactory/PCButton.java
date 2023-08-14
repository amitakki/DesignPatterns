package com.designpatterns.creational.abstractfactory;

// Concrete Product: PCButton
public class PCButton implements IButton {
    @Override
    public void click() {
        System.out.println("PCButton: Clicked!");
    }
}
