package com.codewithamit.creational.abstractfactory;

// Concrete Product: MobileCheckbox
public class MobileCheckbox implements ICheckbox {

    @Override
    public void select() {
        System.out.println("MobileCheckbox: Selected!");
    }
}
