package com.codewithamit.creational.abstractfactory;

// Abstract Factory
interface UIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
