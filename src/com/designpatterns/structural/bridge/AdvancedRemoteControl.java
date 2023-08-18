package com.designpatterns.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    private boolean mute = false;

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        mute = !mute;
        if (mute) turnOff(); else turnOn();
        System.out.println(mute? "Muted" : "UnMute");
    }
}
