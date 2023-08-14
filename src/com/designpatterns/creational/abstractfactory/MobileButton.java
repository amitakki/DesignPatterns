package com.designpatterns.creational.abstractfactory;

// Concrete Product: MobileButton
public class MobileButton implements IButton {
    @Override
    public void click() {
        System.out.println("MobileButton: Clicked!");
    }
}
