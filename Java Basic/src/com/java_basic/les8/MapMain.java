package com.java_basic.les8;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {

    public static void main(String[] args) {
        // Мисоли 1
        HashMap<String, String> mapObject1 = new HashMap<>();

        System.out.println("Калид:арзишро ба mapObject1 гузоштан");
        mapObject1.put("Name", "Исканда");
        mapObject1.put("Age", "28");
        mapObject1.put("Occupation", "Барномасоз");
        mapObject1.put("Gender", "Мард");

        Set<String> allKeysOfMapObject1 = mapObject1.keySet();
        for (String key : allKeysOfMapObject1) {
            System.out.println(String.format("mapObject1->key: '%s'; mapObject1.get(key): '%s'", key,
                    mapObject1.get(key)));
        }

        // Мисоли 2
        TreeMap<String, String> mapObject2 = new TreeMap<>();

        System.out.println("\nКалид:арзишро ба mapObject2 гузоштан");
        mapObject2.put("Name", "Исканда");
        mapObject2.put("Age", "28");
        mapObject2.put("Occupation", "Барномасоз");
        mapObject2.put("Gender", "Мард");

        Set<String> allKeysOfMapObject2 = mapObject2.keySet();
        for (String key : allKeysOfMapObject2) {
            System.out.println(String.format("mapObject2->key: '%s'; mapObject2.get(key): '%s'", key,
                    mapObject2.get(key)));
        }
    }
}
