package com.designpatterns.creational.abstractfactory;

// Concrete Factory for Mobile
public class MobileFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new MobileButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MobileCheckbox();
    }
}
