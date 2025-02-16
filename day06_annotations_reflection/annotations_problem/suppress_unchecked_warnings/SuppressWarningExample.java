package com.day06_annotations_reflection.annotations_problem.suppress_unchecked_warnings;

import java.util.ArrayList;

public class SuppressWarningExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Creating an ArrayList without specifying a generic type
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(100);

        System.out.println("List items: " + list);
    }
}
