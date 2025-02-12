package com.day02_collection.set_interface.problem04;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        // Creating an unsorted HashSet
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert set to a list
        List<Integer> sortedList = new ArrayList<>(numberSet);

        // Sort the list in ascending order
        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList); // Output: [1, 3, 5, 9]
    }
}
