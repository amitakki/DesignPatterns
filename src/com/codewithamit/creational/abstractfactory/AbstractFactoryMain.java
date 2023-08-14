package com.codewithamit.creational.abstractfactory;

public class AbstractFactoryMain {

    public static void createUI(UIFactory factory) {
        IButton button = factory.createButton();
        ICheckbox checkbox = factory.createCheckbox();
        button.click();
        checkbox.select();
    }

    public static void main(String[] args) {
        // Create PC UI
        UIFactory pcFactory = new PCFactory();
        createUI(pcFactory);
        // Output:
        // PCButton: Clicked!
        // PCCheckbox: Selected!

        // Create Mobile UI
        UIFactory mobileFactory = new MobileFactory();
        createUI(mobileFactory);
        // Output:
        // MobileButton: Clicked!
        // MobileCheckbox: Selected!
    }
}
