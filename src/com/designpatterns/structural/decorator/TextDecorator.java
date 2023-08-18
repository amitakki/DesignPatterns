package com.designpatterns.structural.decorator;

// Decorator abstract class
abstract class TextDecorator implements Text {

    private final Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String format() {
        return decoratedText.format();
    }
}
