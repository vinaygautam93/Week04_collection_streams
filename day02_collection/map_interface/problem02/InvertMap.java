package com.day02_collection.map_interface.problem02;

import java.util.*;

class InvertMap {
    public static Map<Integer, List<String>> invert(Map<String, Integer> map) {
        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            inverted.putIfAbsent(entry.getValue(), new ArrayList<>());
            inverted.get(entry.getValue()).add(entry.getKey());
        }
        return inverted;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 1);
        System.out.println(invert(map)); // Output: {1=[A, C], 2=[B]}
    }
}
