package com.day03_streams.problem05;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        String inputImage = "input.jpg";  // Input image file
        String outputImage = "output.jpg"; // Output image file

        try (FileInputStream fis = new FileInputStream(inputImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read image data into byte array
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            // Convert byte array to output file
            try (FileOutputStream fos = new FileOutputStream(outputImage)) {
                fos.write(baos.toByteArray());
                System.out.println("Image copied successfully!");
            }

        } catch (IOException e) {
            System.out.println("Error: Unable to process image.");
        }
    }
}
