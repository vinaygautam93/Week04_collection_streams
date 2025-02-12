package com.day02_collection.set_interface.problem02;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        // Creating two sets with some common and some unique elements
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Union (all unique elements from both sets)
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // Adds all elements from set2
        System.out.println("Union: " + union); // Output: {1, 2, 3, 4, 5}

        // Intersection (only common elements)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Keeps only elements present in both sets
        System.out.println("Intersection: " + intersection); // Output: {3}
    }
}
