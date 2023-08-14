package com.designpatterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new StandardComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(computerBuilder);
        Computer computer = computerDirector.buildComputer();
        System.out.println(computer);
    }
}
