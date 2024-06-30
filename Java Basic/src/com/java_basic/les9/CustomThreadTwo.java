package com.java_basic.les9;

public class CustomThreadTwo extends Thread {

    private Object commonObject;

    public CustomThreadTwo(String threadName, Object commonObject) {
        super(threadName);
        this.commonObject = commonObject;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " мониторинги объекти умумиро мегирад: " + this.commonObject);
        System.out.println(this.getName() + " дар холати интизори аст");
        try {
            this.wait(1000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(this.getName() + "дар холати: '" + this.getState() + "'");
        try {
            Thread.sleep(1000); // хомуш кардан чараенро
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(this.getName() + " анчом ёфта истодааст");
    }
}
