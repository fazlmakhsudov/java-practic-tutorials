package com.java_basic.les9;

public class MonitorMain {

    public static void main(String[] args) {
        Object commonObject = "'common resource'";

        // Мисоли 1
        System.out.println("== Мисоли 1 ==");
        CustomThreadTwo customThreadTwo1 = new CustomThreadTwo("ThreadOne", commonObject);
        CustomThreadTwo customThreadTwo2 = new CustomThreadTwo("ThreadTwo", commonObject);

        customThreadTwo1.start();
        customThreadTwo2.start();

        int counter = 0;
        while (true) {
            if (counter >= 3) {
                break;
            }
            if (customThreadTwo1.getState() != Thread.State.RUNNABLE) {
                counter++;
                System.out.println(String.format("%s дар ҳолати '%s' аст: ", customThreadTwo1.getName(),
                        customThreadTwo1.getState()));
            }
            if (customThreadTwo2.getState() != Thread.State.RUNNABLE) {
                counter++;
                System.out.println(String.format("%s дар ҳолати '%s' аст: ", customThreadTwo2.getName(),
                        customThreadTwo2.getState()));
            }
            try {
                Thread.sleep(300); // хомуш кардан чараени ичрои асоси
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        // Мисоли 2
        System.out.println("\n== Мисоли 2 ==");
        SynchronizedCustomThread synchronizedCustomThread1 =
                new SynchronizedCustomThread("ThreadThree", commonObject);
        SynchronizedCustomThread synchronizedCustomThread2 =
                new SynchronizedCustomThread("ThreadFour", commonObject);

        synchronizedCustomThread1.start();
        synchronizedCustomThread2.start();

        counter = 0;

        while (true) {
            if (counter >= 3) {
                break;
            }
            if (synchronizedCustomThread1.getState() != Thread.State.RUNNABLE) {
                counter++;
                System.out.println(String.format("%s дар ҳолати '%s' аст: ", synchronizedCustomThread1.getName(),
                        synchronizedCustomThread1.getState()));
            }
            if (synchronizedCustomThread2.getState() != Thread.State.RUNNABLE) {
                counter++;
                System.out.println(String.format("%s дар ҳолати '%s' аст: ", synchronizedCustomThread2.getName(),
                        synchronizedCustomThread2.getState()));
            }
            try {
                Thread.sleep(300); // хомуш кардан чараени ичрои асоси
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
