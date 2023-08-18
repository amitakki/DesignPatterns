package com.designpatterns.structural.composite;

// Client code
public class CompositeMain {

    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory directory1 = new Directory("Folder 1");
        Directory directory2 = new Directory("Folder 2");

        directory1.addComponent(file1);
        directory2.addComponent(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        rootDirectory.showDetails();
    }
}
