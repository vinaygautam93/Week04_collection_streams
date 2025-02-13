package com.day03_streams.problem06;

import java.io.*;

public class UpperToLowerCase {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase()); // Convert to lowercase
                bw.newLine();
            }

            System.out.println("Conversion done!");

        } catch (IOException e) {
            System.out.println("Error: Unable to process file.");
        }
    }
}
