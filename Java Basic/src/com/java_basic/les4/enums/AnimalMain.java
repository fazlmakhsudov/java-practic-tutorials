package com.java_basic.les4.enums;

public class AnimalMain {

    public static void main(String[] args) {
        AnimalEnum dog = AnimalEnum.DOG;
        AnimalEnum cat = AnimalEnum.CAT;
        AnimalEnum sheep = AnimalEnum.SHEEP;

        System.out.println("Арзиши хосияти intField объекти dog: " + dog.getIntField());
        System.out.println("Арзиши хосияти intField объекти cat: " + cat.getIntField());
        System.out.println("Арзиши хосияти intField объекти sheep: " + sheep.getIntField());

        System.out.println();

        for (AnimalEnum animal : AnimalEnum.values()) {
            System.out.println(String.format("Арзиши нобаени хосияти intField номбаршудаи %s: %d",
                    animal.name(), animal.getIntField()));
        }
    }
}
