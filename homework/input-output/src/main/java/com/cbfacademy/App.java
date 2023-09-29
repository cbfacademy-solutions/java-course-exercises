package com.cbfacademy;

import java.util.HashMap;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        String existingFilePath = "homework/input-output/src/main/resources/example.properties";

        HashMap<String, String> propMap = new HashMap<String, String>() {
            {
                put("datasource.url", "localhost");
                put("datasource.port", "5353");
                put("datasource.user", "cbfacademy");
                put("datasource.password", "password");
            }
        };
        String newFilePath = "homework/input-output/src/main/resources/configuration.properties";

        PropertiesFileHandler.loadProperties(existingFilePath);
        Properties createdProperties = PropertiesFileHandler.createFile(propMap, newFilePath);

        System.out.println("File created: " + createdProperties.toString());
    }
}
