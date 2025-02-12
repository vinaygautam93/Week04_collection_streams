package com.day02_collection.set_interface.problem01;

import java.util.*;

public class CheckSetEquality {
    public static void main(String[] args) {
        // Creating two sets with the same elements but in different orders
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        // HashSet does not maintain order, so we can directly compare them
        System.out.println("Are sets equal? " + set1.equals(set2)); // Output: true
    }
}
