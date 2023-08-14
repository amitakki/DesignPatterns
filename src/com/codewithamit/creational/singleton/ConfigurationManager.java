package com.codewithamit.creational.singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;

    // Configuration settings
    private String databaseUrl;
    private String apiKey;
    // Add more configuration properties as needed

    // Private constructor to prevent direct instantiation from other classes
    private ConfigurationManager() {
        // Load configuration settings from a configuration file or any other source
        databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        apiKey = "my-api-key";
    }

    // Static method to provide the global access point to the Singleton instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Getter methods for configuration properties
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    // Other methods to manage and update configuration settings can be added here
}
