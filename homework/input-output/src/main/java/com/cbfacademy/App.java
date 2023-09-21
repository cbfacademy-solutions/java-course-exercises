package com.cbfacademy;

import java.util.HashMap;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        String existingFilePath = "homework/input-output/src/test/resources/test_file.properties";

        HashMap<String, String> propMap = new HashMap<String, String>() {
            {
                put("datasource.url", "localhost");
                put("datasource.port", "5353");
                put("datasource.user", "cbfacademy");
                put("datasource.password", "password");
            }
        };
        String newFilePath = "homework/input-output/src/test/resources/output_test_file.properties";

        PropertiesFileHandler.loadProperties(existingFilePath);
        Properties createdProperties = PropertiesFileHandler.createFile(propMap, newFilePath);

        System.out.println("File created: " + createdProperties.toString());
    }
}
