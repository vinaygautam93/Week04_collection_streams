package com.day02_collection.queue_interface.problem01;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));

        // Using a stack to reverse the queue
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll()); // Remove from queue and push to stack
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop()); // Pop from stack and add back to queue
        }

        System.out.println("Reversed Queue: " + queue); // Output: [30, 20, 10]
    }
}
