package com.java_basic.les9;

import java.util.concurrent.atomic.AtomicInteger;

public class CustomThreadThree extends Thread {

    private Number counter;

    public CustomThreadThree(String name, Number counter) {
        super(name);
        this.counter = counter;
        System.out.println(this.getName() + " қабул кард арзиш: " + counter + ", бо намуди: " +
                counter.getClass().getSimpleName());
    }

    @Override
    public void run() {
        while (counter.intValue() < 6) {
            if (counter instanceof Integer) {
                counter = counter.intValue() + 1; // илова кардани арзиш + 1 (инкрементасия)
            }
            if (counter instanceof AtomicInteger) {
                ((AtomicInteger) counter).getAndIncrement(); //  илова кардани арзиш + 1 (инкрементасия)
            }
            System.out.println(this.getName() + " тағир дод арзишро: " + counter);
            try {
                Thread.sleep(100); // хомуш кардан
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
