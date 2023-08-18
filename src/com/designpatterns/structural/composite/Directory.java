package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite class (Directory)
public class Directory implements Component {
    private final String name;

    private final List<Component> componentList = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (Component component: componentList) {
            component.showDetails();
        }
    }
}
