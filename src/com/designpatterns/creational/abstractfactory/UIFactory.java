package com.designpatterns.creational.abstractfactory;

// Abstract Factory
interface UIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
