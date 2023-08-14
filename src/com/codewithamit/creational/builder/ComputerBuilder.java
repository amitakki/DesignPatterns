package com.codewithamit.creational.builder;

// Builder interface
public interface ComputerBuilder {
    void setCPU(String cpu);
    void setRAM(int ram);
    void setStorage(int storage);
    Computer build();
}
