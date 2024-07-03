package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        try {
            URL url = new URI("https://codingblackfemales.com").toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Setting the request method to GET
            connection.setRequestMethod("GET");

            // Using try-with-resources to ensure resources are closed
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
            }

            // Closing the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}