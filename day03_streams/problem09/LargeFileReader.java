package com.day03_streams.problem09;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "large_log.txt"; // Path of the large file

        // Try-with-resources to automatically close BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("Lines containing 'error':");
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) { // Case-insensitive check
                    System.out.println(line); // Print only error lines
                }
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }
    }
}
