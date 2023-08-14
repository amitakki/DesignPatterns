package com.designpatterns.creational.builder;

// Product
class Computer {
    private String cpu;
    private int ram;
    private int storage;

    // getters and setters

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public int getRAM() {
        return ram;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Cpu = '" + cpu + '\'' +
                ", Ram = " + ram +
                ", Storage = " + storage +
                '}';
    }
}
