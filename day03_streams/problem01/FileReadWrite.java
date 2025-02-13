package com.day03_streams.problem01;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        // Define file paths
        String sourceFile = "source.txt";   // File to read from
        String destinationFile = "destination.txt"; // File to write into

        // Using try-with-resources to automatically close files
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            // Read data byte by byte and write to the new file
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            // If the file is missing, display an error
            System.out.println("Error: Source file not found!");
        } catch (IOException e) {
            // If an input-output error occurs
            System.out.println("Error: Unable to read/write file!");
        }
    }
}
