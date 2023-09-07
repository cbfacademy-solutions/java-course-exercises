package com.cbfacademy;

import java.io.*;
import java.net.*;

public class ExerciseServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Server is listening on port 4040...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                    String message = in.readLine();

                    System.out.println("Received message from client: " + message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
