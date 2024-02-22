package com.java_basic.les1;

class House {

    private int id;
    private int numberFloors;
    private int numberWindows;

    public void build() {
        // some code
        System.out.println(String.format("Хонаи %d сохта шуд", id));
    }

    public void repair() {
        // some code
        System.out.println(String.format("Хонаи %d таъмир карда шуд", id));
    }

    public void setId(int id) {
        this.id = id;
    }

}

class Tree {

    private int id;
    private int height;
    private String kind;

    public void plant() {
        //some code
        System.out.println(String.format("Дарахти %d шинонда шуд", id));
    }

    public boolean water() {
        //some code
        System.out.print(String.format("Дарахти %d об дода шуд: ", id));
        return true;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Main {

    public static void main(String[] args) {
        House firstHouse = new House();
        firstHouse.setId(1);
        firstHouse.build();
        System.out.println("-----");

        House secondHouse = new House();
        secondHouse.setId(2);
        secondHouse.build();
        System.out.println("-----");

        Tree tree22 = new Tree();
        tree22.setId(22);
        tree22.plant();
        boolean isWatered = tree22.water();
        System.out.println(isWatered);
        System.out.println("-----");

        Tree tree44 = new Tree();
        tree44.setId(44);
        tree44.plant();
        isWatered = tree44.water();
        System.out.println(isWatered);

    }

}

