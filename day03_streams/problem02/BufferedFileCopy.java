package com.day03_streams.problem02;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt";   // Large file to copy
        String destinationFile = "copy_largefile.txt"; // Destination file

        // Track time to compare performance
        long startTime, endTime;

        // Using buffered streams for efficient file copy
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            startTime = System.nanoTime(); // Start time
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            endTime = System.nanoTime(); // End time

            System.out.println("Buffered Copy Completed! Time taken: " + (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error: Unable to copy file.");
        }
    }
}
