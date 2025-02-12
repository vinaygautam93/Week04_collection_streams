package com.day02_collection.queue_interface.problem05;

import java.util.*;

class CircularBuffer {
    private int[] buffer;
    private int size, front, rear, count;

    // Constructor to initialize the buffer with a fixed size
    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add an element to the buffer (overwrites oldest element if full)
    public void add(int num) {
        rear = (rear + 1) % size;
        buffer[rear] = num;
        if (count < size) {
            count++;
        } else {
            front = (front + 1) % size; // Move front if overwriting
        }
    }

    // Display buffer contents
    public void display() {
        int temp = front;
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[temp] + " ");
            temp = (temp + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.display(); // Output: 1 2 3
        cb.add(4);
        cb.display(); // Output: 2 3 4 (1 is overwritten)
    }
}
