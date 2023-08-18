package com.designpatterns.structural.bridge;

// Abstraction
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }


    void turnOn() {
        device.turnOn();
    }

    void turnOff() {
        device.turnOff();
    }

    void setChannel(int channel) {
        device.setChannel(channel);
    }
}
