package com.day02_collection.list_interface.problem05;

import java.util.*;

public class FindNthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        String nthElement = findNthFromEnd(list, n);
        System.out.println(n + "th element from the end: " + nthElement);
    }

    // Function to find the nth element from the end without calculating size
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        // Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) first.next();
            else return null; // If n is greater than list size
        }

        // Move both pointers until the first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }
}
