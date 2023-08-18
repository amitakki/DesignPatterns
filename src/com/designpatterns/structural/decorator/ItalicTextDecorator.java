package com.designpatterns.structural.decorator;

// Concrete Decorators (Formatting options)
public class ItalicTextDecorator extends TextDecorator {

    public ItalicTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String format() {
        return "<i>" + super.format() + "</i>";
    }
}
