package com.java_basic.les7.serialization;

import java.io.Serializable;

public class SomeClass implements Serializable { // интерфейси Serializable бояд амалӣ карда шавад

    private int intField;       // primitive type
    private String stringField; // object type
    private Double doubleField; // object type


    public SomeClass(int intField, String stringField, Double doubleField) {
        this.intField = intField;
        this.stringField = stringField;
        this.doubleField = doubleField;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                ", doubleField=" + doubleField +
                '}';
    }
}
