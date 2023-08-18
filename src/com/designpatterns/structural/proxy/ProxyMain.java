package com.designpatterns.structural.proxy;

// Client Code
public class ProxyMain {
    public static void main(String[] args) {
        InternetAccess internetAccess = new ProxyInternetAccess();

        internetAccess.connectTo("google.com");
        internetAccess.connectTo("facebook.com");
        internetAccess.connectTo("twitter.com");
    }
}
