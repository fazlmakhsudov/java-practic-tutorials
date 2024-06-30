package com.java_basic.les9;

import java.util.concurrent.Callable;

public class CallableCustomClass implements Callable<String> {

    @Override
    public String call() {
        System.out.println("Callable custom class -> вазифа ичро карда мешавад");
        return "вазифа ичро карда мешавад";
    }

}
