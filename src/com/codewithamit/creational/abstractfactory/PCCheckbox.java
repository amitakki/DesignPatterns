package com.codewithamit.creational.abstractfactory;

// Concrete Product: PCCheckbox
public class PCCheckbox implements ICheckbox {
    @Override
    public void select() {
        System.out.println("PCCheckbox: Selected!");
    }
}
