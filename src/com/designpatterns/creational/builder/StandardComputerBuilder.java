package com.designpatterns.creational.builder;

public class StandardComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();

    @Override
    public void setCPU(String cpu) {
        computer.setCPU(cpu);
    }

    @Override
    public void setRAM(int ram) {
        computer.setRAM(ram);
    }

    @Override
    public void setStorage(int storage) {
        computer.setStorage(storage);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
