package com.designpatterns.structural.decorator;

// Concrete Component (Base Text)
public class PlainText  implements Text {
    private final String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String format() {
        return content;
    }
}
