package com.java_basic.les8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {
        // Example 1
        HashSet<String> setObject1 = new HashSet<>();

        System.out.println("Ба setObject1 элемент илова кардан: " + setObject1.add("Як"));
        setObject1.add("Ду");

        System.out.println("Элемент дар маҷмӯи setObject1 мавҷуд аст: " + setObject1.contains("Як"));

        System.out.println("Андозаи setObject1: " + setObject1.size());

        Iterator<String> iterator = setObject1.iterator(); // get iterator
        while (iterator.hasNext()) {
            System.out.println("setObject1.iterator().next() -> " + iterator.next());
        }

        setObject1.clear(); // тоза кардани setobject1

        // Example 2
        TreeSet<Integer> setObject2 = new TreeSet<>();

        System.out.println("\nБа setObject2 элемент илова кардан: " + setObject2.add(4));
        setObject2.add(2);
        setObject2.add(3);
        setObject2.add(1);

        for (Integer element : setObject2) {
            System.out.println("foreach setObject2: " + element); // ба тартиб андохта мешавад
        }
    }
}
