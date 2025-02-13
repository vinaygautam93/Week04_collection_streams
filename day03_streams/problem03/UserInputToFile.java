package com.day03_streams.problem03;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        // BufferedReader for efficient user input
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_data.txt")) {

            // Asking user for input
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine()); // Convert to integer

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Writing user input to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("User data saved to file successfully!");

        } catch (IOException e) {
            System.out.println("Error: Unable to save user data.");
        }
    }
}
