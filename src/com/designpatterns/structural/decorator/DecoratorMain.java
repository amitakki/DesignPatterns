package com.designpatterns.structural.decorator;

// Client Code
public class DecoratorMain {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello World");
        Text boldText = new BoldTextDecorator(plainText);
        Text italicUnderlineText = new ItalicTextDecorator(new UnderlineTextDecorator(plainText));

        System.out.println("Plain Text: " + plainText.format());
        System.out.println("Bold Text: " + boldText.format());
        System.out.println("Italic and Underline Text: " + italicUnderlineText.format());
    }
}