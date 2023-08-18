package com.designpatterns.structural.decorator;

// Concrete Decorators (Formatting options)
public class BoldTextDecorator extends TextDecorator {

    public BoldTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String format() {
        return "<b>" + super.format() + "</b>";
    }
}
