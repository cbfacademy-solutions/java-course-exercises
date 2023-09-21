package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "PropertiesFileHandler Test Suite")
public class PropertiesFileHandlerTest {
    Map<String, String> propMap;

    @Test
    @DisplayName(value = "test loadProperties() returns data filled properties object when given the correct file path")
    public void loadProperties_ReturnsExpectedResult() {
        Properties result = PropertiesFileHandler.loadProperties("src/test/resources/test_file.properties");

        assertTrue(result.size() > 0);
    }

    @Test
    @DisplayName(value = "test loadProperties() returns an empty properties object when the file does not exist")
    public void loadProperties_ReturnsExpectedResultForMissingFile() {
        Properties result = PropertiesFileHandler.loadProperties("src/test/resources/does_not_exist.properties");

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName(value = "test loadProperties() returns an empty properties object when the file path is an empty string")
    public void loadProperties_ReturnsExpectedResultForEmptyFilePath() {
        Properties result = PropertiesFileHandler.loadProperties("");

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName(value = "test loadProperties() returns an empty properties object when the file  path is null")
    public void loadProperties_ReturnsExpectedResultForNullFilePath() {
        Properties result = PropertiesFileHandler.loadProperties(null);

        assertTrue(result.isEmpty());
    }

    @BeforeEach
    public void setUpPropMap() {
        propMap = new HashMap<String, String>() {
            {
                put("test.url", "localhost");
                put("test.port", "1234");
            }
        };
    }

    @Test
    @DisplayName(value = "test createFile() creates a new file at the given file path")
    public void createFile_CreatesNewPropertiesFileAtTheGivenPath() throws IOException {
        String filePath = "src/test/resources/new_file.properties";

        try {
            PropertiesFileHandler.createFile(propMap, filePath);
            assertTrue(Files.exists(Paths.get(filePath)));
        } finally {
            Path fileToDeletePath = Paths.get(filePath);
            Files.delete(fileToDeletePath);
        }
    }

    @Test
    @DisplayName(value = "test createFile() returns existing properties when the destination file already exists")
    public void createFile_ReturnsExpectedResultForExistingFilePath() {
        Properties result = PropertiesFileHandler.createFile(propMap, "src/test/resources/test_file.properties");

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName(value = "test createFile() returns an empty properties object when the destination file path is an empty string")
    public void createFile_ReturnsExpectedResultForEmptyFilePath() {
        String filePath = "";
        Properties result = PropertiesFileHandler.createFile(propMap, filePath);

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName(value = "test createFile returns an empty properties object when the destination file path is null")
    public void createFileMethodReturnsExpectedResultForNullFilePath() {
        String filePath = null;
        Properties result = PropertiesFileHandler.createFile(propMap, filePath);

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName(value = "test createFile() returns an empty properties object when the properties map is empty")
    public void createFile_ReturnsExpectedResultForEmptyPropertiesMap() {
        HashMap<String, String> propMap = new HashMap<String, String>();
        Properties result = PropertiesFileHandler.createFile(propMap,
                "homework/input-output/src/test/resources/test_empty_output_file.properties");

        assertTrue(result.isEmpty());
    }
}