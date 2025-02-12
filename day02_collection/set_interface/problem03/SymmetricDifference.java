package com.day02_collection.set_interface.problem03;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        // Creating two sets with some common and some different elements
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Symmetric difference: elements present in either set but not both
        Set<Integer> symDiff = new HashSet<>(set1);
        symDiff.addAll(set2); // Add all elements from both sets

        // Remove the intersection (common elements)
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2); // Find common elements
        symDiff.removeAll(temp); // Remove common elements from symDiff

        System.out.println("Symmetric Difference: " + symDiff); // Output: {1, 2, 4, 5}
    }
}
