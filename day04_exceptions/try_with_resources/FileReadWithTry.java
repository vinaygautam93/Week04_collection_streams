package com.day04_exceptions.try_with_resources;

import java.io.*;

public class FileReadWithTry {
    public static void main(String[] args) {
        String fileName = "info.txt";

        // Try-with-resources ensures the file is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String firstLine = reader.readLine(); // Read the first line
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            // Handle any file errors
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
