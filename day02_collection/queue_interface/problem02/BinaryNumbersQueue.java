package com.day02_collection.queue_interface.problem02;

import java.util.*;

public class BinaryNumbersQueue {
    public static void main(String[] args) {
        int n = 5; // Generate first N binary numbers
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < n; i++) {
            String binary = queue.poll();
            System.out.print(binary + " "); // Print binary number

            // Generate next binary numbers and add to queue
            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }
    }
}
