package com.java_basic.les4.interfaces;

public interface Sound {

    void sound();

    default void soundByDefault() {
        System.out.println("Ҳайвон садои кам мебарорад");
    }

    static void staticSound() {
        System.out.println("Ҳайвон садои баланд мекунад");
    }

}
