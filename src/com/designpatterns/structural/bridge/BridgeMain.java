package com.designpatterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.turnOn();
        remoteControl.setChannel(8);
        remoteControl.turnOff();

        RemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        advancedRemoteControl.turnOn();
        advancedRemoteControl.setChannel(103);
        advancedRemoteControl.turnOff();
    }
}
