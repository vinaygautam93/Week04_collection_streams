package com.day03_streams.problem07;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        String file = "students.dat";

        // Writing primitive data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(9.2);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(8.5);

            System.out.println("Student data saved!");

        } catch (IOException e) {
            System.out.println("Error: Unable to save data.");
        }

        // Reading primitive data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (dis.available() > 0) {
                int id = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println(id + " | " + name + " | GPA: " + gpa);
            }

        } catch (IOException e) {
            System.out.println("Error: Unable to read data.");
        }
    }
}
