package com.designpatterns.structural.adapter;

// Adaptee (USB device)
public class USBDevice {
    void plugInUSB() {
        System.out.println("USB device plugged in.");
    }
}