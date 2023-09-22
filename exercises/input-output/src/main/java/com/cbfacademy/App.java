package com.cbfacademy;

import java.io.IOException;
import java.util.List;

public class App {
    private static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        String sourcePath = "exercises/input-output/src/main/resources/exercise.txt";
        String reversedPath = "exercises/input-output/src/main/resources/reversed.txt";

        try {
            readFile(sourcePath);
            reverseFile(sourcePath, reversedPath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Reads the contents of a file and outputs line-by-line to the console
     * 
     * @param filePath
     * @throws IOException
     */
    public static void readFile(String filePath) throws IOException {
        List<String> lines = fileManager.readFile(filePath);

        System.out.println("\n**************************");
        System.out.println(String.format("Contents of %s:", filePath));
        System.out.println("**************************");

        for (String line : lines) {
            System.out.println(line);
        }
    }

    /**
     * Reverses the contents of a file and saves to a new file
     * 
     * @param sourcePath
     * @param targetPath
     * @throws IOException
     */
    public static void reverseFile(String sourcePath, String targetPath) throws IOException {
        fileManager.reverseLines(sourcePath, targetPath);

        readFile(targetPath);
    }
}
