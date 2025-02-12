package com.day02_collection.map_interface.problem03;

import java.util.*;

class MaxKeyFinder {
    public static String findMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println(findMaxKey(map)); // Output: B
    }
}
