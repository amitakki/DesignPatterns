package com.designpatterns.structural.bridge;

// Implementor interface
public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
}
