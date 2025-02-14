package com.day04_exceptions.checked_exception;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class CheckedException {
    public static void main(String[] args) {
        // File name to read
        String fileName = "data.txt";

        // Try reading the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print file content
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found "  + e.getMessage()); // Handle missing file
        }
    }
}
