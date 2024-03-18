package com.java_basic.les4.enums;

public enum AnimalEnum {

    DOG(1), CAT(2), COW, SHEEP, GOAT, CHICKEN;

    private int intField;

    AnimalEnum() {
    }

    AnimalEnum(int a) {
        this.intField = a;
    }

    public int getIntField() {
        return this.intField;
    }

}
