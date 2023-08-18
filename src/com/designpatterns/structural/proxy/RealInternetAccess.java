package com.designpatterns.structural.proxy;

// Real Subject
public class RealInternetAccess implements InternetAccess {

    @Override
    public void connectTo(String website) {
        System.out.println("Connected to " + website);
    }
}
