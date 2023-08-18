package com.designpatterns.structural.adapter;

// Client code (Laptop)
public class Laptop {

    public void useLaptopPort(LaptopPort laptopPort) {
        laptopPort.connect();
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        USBDevice usbDevice = new USBDevice();
        USBToLaptopPortAdapter adapter = new USBToLaptopPortAdapter(usbDevice);
        laptop.useLaptopPort(adapter);
    }
}
