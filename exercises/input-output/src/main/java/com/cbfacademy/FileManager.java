package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A utility class for managing file operations.
 */
public class FileManager {
    /**
     * Step 1: Read a text file using a BufferedReader and return a Stream of lines.
     *
     * @param filename The name of the file to read.
     * @return A Stream of lines from the file.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public List<String> readFile(String filename) throws IOException {
        Path filePath = Paths.get(filename);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toString()))) {
            return reader.lines().collect(Collectors.toList());
        }
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

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath.toString()));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath.toString()))) {
            String line;
            Boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = !firstLine;
                } else {
                    writer.newLine();
                }

                writer.write(line);
            }
        }
    }

    /**
     * Step 2: Update to use the java.nio.* classes
     *
     * @param filename The name of the file to read.
     * @return A Stream of lines from the file.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public List<String> readFileNio(String filename) throws IOException {
        Path filePath = Paths.get(filename);

        return Files.readAllLines(filePath);
    }

    /**
     * Copy the contents of one file to another.
     *
     * @param inputFile  The name of the source file to copy from.
     * @param outputFile The name of the target file to copy to.
     * @throws IOException If an I/O error occurs during the copy process.
     */
    public void copyNio(String inputFile, String outputFile) throws IOException {
        Path inputPath = Paths.get(inputFile);
        Path outputPath = Paths.get(outputFile);

        // Copy the contents from input to output
        Files.copy(inputPath, outputPath, StandardCopyOption.REPLACE_EXISTING);
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
            Boolean firstLine = true;

            for (String line : lines) {
                if (firstLine) {
                    firstLine = !firstLine;
                } else {
                    writer.newLine();
                }

                writer.write(line);
            }
        }
    }
}
