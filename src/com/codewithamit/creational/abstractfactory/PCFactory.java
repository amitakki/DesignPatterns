package com.codewithamit.creational.abstractfactory;

// Concrete Factory for PC
public class PCFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new PCButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new PCCheckbox();
    }
}
