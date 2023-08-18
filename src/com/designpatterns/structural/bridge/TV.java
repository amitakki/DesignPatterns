package com.designpatterns.structural.bridge;

// Concrete Implementors
public class TV implements Device {

    private boolean on = true;
    private int channel = 1;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is off");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV Channel is set to " + channel);
    }
}