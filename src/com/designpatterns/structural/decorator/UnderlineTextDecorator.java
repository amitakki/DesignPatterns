package com.designpatterns.structural.decorator;

// Concrete Decorators (Formatting options)
public class UnderlineTextDecorator extends TextDecorator {

    public UnderlineTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String format() {
        return "<u>" + super.format() + "</u>";
    }
}
