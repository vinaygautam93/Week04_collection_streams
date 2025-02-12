package com.day02_collection.list_interface.problem03;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2; // Number of positions to rotate

        System.out.println("Original List: " + list);
        rotateList(list, rotateBy);
        System.out.println("Rotated List: " + list);
    }

    // Function to rotate the list
    public static void rotateList(List<Integer> list, int k) {
        int size = list.size();
        k %= size; // To handle cases where k > size
        List<Integer> rotated = new ArrayList<>();

        // Add the rotated part first
        rotated.addAll(list.subList(k, size));
        // Add the beginning elements at the end
        rotated.addAll(list.subList(0, k));

        // Update the original list
        list.clear();
        list.addAll(rotated);
    }
}
