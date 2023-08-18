package com.designpatterns.structural.adapter;

// Adapter
public class USBToLaptopPortAdapter implements LaptopPort {
    private final USBDevice usbDevice;

    public USBToLaptopPortAdapter(USBDevice usbDevice) {
        this.usbDevice = usbDevice;
    }

    @Override
    public void connect() {
        usbDevice.plugInUSB();
    }
}
