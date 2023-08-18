package com.designpatterns.structural.bridge;

// Concrete Implementors
public class Radio implements Device {

    private boolean on = true;
    private int channel = 1;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is off");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio Channel is set to " + channel);
    }
}