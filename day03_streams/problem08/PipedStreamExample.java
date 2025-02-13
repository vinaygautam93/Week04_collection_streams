package com.day03_streams.problem08;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            pos.write(message.getBytes()); // Writing data to PipedOutputStream
            pos.close(); // Closing the stream after writing
        } catch (IOException e) {
            System.out.println("Error: Unable to write data.");
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");
            while ((data = pis.read()) != -1) {
                System.out.print((char) data); // Reading byte by byte
            }
            System.out.println();
            pis.close();
        } catch (IOException e) {
            System.out.println("Error: Unable to read data.");
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Creating threads for writing and reading
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start();
            reader.start();
        } catch (IOException e) {
            System.out.println("Error: Unable to connect streams.");
        }
    }
}
