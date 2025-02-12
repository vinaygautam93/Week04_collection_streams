package com.day02_collection.set_interface.problem05;

import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> mainSet = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Checking if subset is contained within mainSet
        boolean isSubset = mainSet.containsAll(subset);

        System.out.println("Is subset: " + isSubset); // Output: true
    }
}
