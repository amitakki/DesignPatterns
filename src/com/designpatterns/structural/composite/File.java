package com.designpatterns.structural.composite;

// Leaf class (File)
public class File implements Component {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
