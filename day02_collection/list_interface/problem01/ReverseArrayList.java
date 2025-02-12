package com.day02_collection.list_interface.problem01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayList {

    // Generic method to reverse a given list (works for both ArrayList and LinkedList)
    static <T> void reverseList(List<T> arrayListNum) {
        int n = arrayListNum.size();
        int f = 0;  // Pointer to the first element
        int e = n - 1;  // Pointer to the last element

        // Swap elements from both ends moving towards the center
        while (f < e) {
            T temp = arrayListNum.get(f);
            arrayListNum.set(f, arrayListNum.get(e));
            arrayListNum.set(e, temp);
            f++;  // Move front pointer forward
            e--;  // Move end pointer backward
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an ArrayList and add elements
        List<Integer> arrayListNum = new ArrayList<>();
        arrayListNum.add(5);
        arrayListNum.add(6);
        arrayListNum.add(7);
        arrayListNum.add(8);
        arrayListNum.add(9);

        // Reverse the ArrayList
        reverseList(arrayListNum);

        // Print the reversed ArrayList
        int n = arrayListNum.size();
        for (int i = 0; i < n; i++) {
            System.out.print(arrayListNum.get(i) + " ");
        }
        System.out.println();

        // Create a LinkedList with the reversed ArrayList elements
        List<Integer> linkedListNum = new LinkedList<>(arrayListNum);

        // Reverse the LinkedList
        reverseList(linkedListNum);

        // Print the reversed LinkedList
        int n2 = linkedListNum.size();
        for (int i = 0; i < n2; i++) {
            System.out.print(linkedListNum.get(i) + " ");
        }

        System.out.println();
        input.close();  // Close the scanner (even though it is unused)
    }
}

