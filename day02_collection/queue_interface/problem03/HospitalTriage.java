package com.day02_collection.queue_interface.problem03;

import java.util.*;

class Patient {
    String name;
    int severity; // Higher value means more severe

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        // PriorityQueue to treat the most severe patient first
        PriorityQueue<Patient> queue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        queue.offer(new Patient("John", 3));
        queue.offer(new Patient("Alice", 5));
        queue.offer(new Patient("Bob", 2));

        // Processing patients based on severity
        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll().name);
        }
    }
}
