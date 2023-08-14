package com.designpatterns.creational.builder;

public class ComputerDirector {
    ComputerBuilder computerBuilder;

    ComputerDirector(ComputerBuilder builder) {
        this.computerBuilder = builder;
    }

    public Computer buildComputer() {
        computerBuilder.setCPU("Intel Core i7");
        computerBuilder.setRAM(16);
        computerBuilder.setStorage(100);
        return computerBuilder.build();
    }
}
