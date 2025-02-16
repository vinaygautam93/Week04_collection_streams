package com.day06_annotations_reflection.reflection_problem.custom_object;

import java.lang.reflect.*;
import java.util.*;

// Example class with fields
class User {
    public String name;
    public int age;
}

// Convert Map data to an object
public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (properties.containsKey(field.getName())) {
                field.set(obj, properties.get(field.getName()));
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Vinay");
        data.put("age", 24);

        User user = toObject(User.class, data);
        System.out.println("User: " + user.name + ", Age: " + user.age);
    }
}
