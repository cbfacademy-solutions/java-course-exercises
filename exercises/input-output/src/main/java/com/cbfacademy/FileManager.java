package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * A utility class for managing file operations.
 */
public class FileManager {
    /**
     * Get a BufferedReader for the provided file.
     *
     * @param filename The name of the file to read.
     * @return A BufferedReader for the specified file.
     * @throws IOException If an I/O error occurs while opening the file.
     */
    public BufferedReader getReader(String filename) throws IOException {
        Path filePath = Paths.get(filename);

        return Files.newBufferedReader(filePath, StandardCharsets.UTF_8);
    }

    /**
     * Copy the contents of one file to another.
     *
     * @param inputFile  The name of the source file to copy from.
     * @param outputFile The name of the target file to copy to.
     * @throws IOException If an I/O error occurs during the copy process.
     */
    public void copy(String inputFile, String outputFile) throws IOException {
        Path inputPath = Paths.get(inputFile);
        Path outputPath = Paths.get(outputFile);

        // Ensure the output file's parent directory exists
        Files.createDirectories(outputPath.getParent());

        // Copy the contents from input to output
        Files.copy(inputPath, outputPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     * Reverse the lines of a text file and write them to another file.
     *
     * @param inputFile  The name of the source file to read lines from.
     * @param outputFile The name of the target file to write reversed lines to.
     * @throws IOException If an I/O error occurs during the file operations.
     */
    public void reverseLines(String inputFile, String outputFile) throws IOException {
        Path inputPath = Paths.get(inputFile);
        Path outputPath = Paths.get(outputFile);

        // Ensure the output file's parent directory exists
        Files.createDirectories(outputPath.getParent());

        // Read the lines from input file
        List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

        // Reverse the lines
        Collections.reverse(lines);

        // Write the reversed lines to the output file
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    /**
     * Main method for testing the FileManager class.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        try {
            // Test the methods
            fileManager.copy("input.txt", "output.txt");
            fileManager.reverseLines("input.txt", "reversed.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
