package com.day02_collection.queue_interface.problem04;

import java.util.*;

public class StackUsingQueues {
    Queue<Integer> queue = new LinkedList<>();

    // Push element to stack
    public void push(int x) {
        queue.offer(x);
        // Move all elements before x to the end to maintain LIFO
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    // Pop element from stack
    public int pop() {
        return queue.poll();
    }

    // Get top element
    public int top() {
        return queue.peek();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top: " + stack.top()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 3
    }
}
