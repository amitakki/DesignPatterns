package com.designpatterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Get configuration properties
        String dbUrl = configManager.getDatabaseUrl();
        String apiKey = configManager.getApiKey();

        System.out.println("Database URL: " + dbUrl);
        System.out.println("API Key: " + apiKey);

        // You can use the configManager in different parts of your application
        // to access the same configuration settings throughout the program.
    }
}
