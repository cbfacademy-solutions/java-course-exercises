package com.cbfacademy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

public class PropertiesFileHandler {

    static Properties loadProperties(String filePath) {
        Properties prop = new Properties();

        if (!isValidFileName(filePath))
            return prop;

        try (Reader reader = new FileReader(filePath)) {
            prop.load(reader);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return prop;
    }

    static Properties createFile(Map<String, String> propertiesToSet, String outputFilePath) {
        Properties prop = new Properties();

        if (!isValidFileName(outputFilePath) || isExistingFile(outputFilePath))
            return prop;

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            propertiesToSet.forEach((key, value) -> prop.setProperty(key, value));
            prop.store(writer, null);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return prop;
    }

    private static boolean isValidFileName(String fileName) {
        if (fileName == null || fileName == "") {
            System.out.println("Invalid filePath: " + fileName);
            return false;
        }

        return true;
    }

    private static boolean isExistingFile(String filePath) {
        if (Files.exists(Paths.get(filePath))) {
            System.out.println("File exists: " + filePath);
            return true;
        }

        return false;
    }
}
