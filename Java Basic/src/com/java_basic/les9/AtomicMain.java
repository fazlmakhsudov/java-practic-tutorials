package com.java_basic.les9;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMain {

    public static void main(String[] args) throws InterruptedException {
        //Мисоли 1
        System.out.println("== Мисоли 1 ==");
        final Integer counter = 0;

        CustomThreadThree customThreadThree1 = new CustomThreadThree("thread1", counter);
        CustomThreadThree customThreadThree2 = new CustomThreadThree("thread2", counter);
        CustomThreadThree customThreadThree3 = new CustomThreadThree("thread3", counter);
        CustomThreadThree customThreadThree4 = new CustomThreadThree("thread4", counter);

        customThreadThree1.start();
        customThreadThree2.start();
        customThreadThree3.start();
        customThreadThree4.start();

        Thread.sleep(2000); // хомуш кардани чараени асоси

        // Мисоли 2
        System.out.println("\n== Мисоли 2 ==");
        AtomicInteger atomicCounter = new AtomicInteger(0);

        CustomThreadThree customThreadThree5 = new CustomThreadThree("atomic_thread1", atomicCounter);
        CustomThreadThree customThreadThree6 = new CustomThreadThree("atomic_thread2", atomicCounter);
        CustomThreadThree customThreadThree7 = new CustomThreadThree("atomic_thread3", atomicCounter);
        CustomThreadThree customThreadThree8 = new CustomThreadThree("atomic_thread4", atomicCounter);

        customThreadThree5.start();
        customThreadThree6.start();
        customThreadThree7.start();
        customThreadThree8.start();

        Thread.sleep(2000); // хомуш кардани чараени асоси
    }
}
