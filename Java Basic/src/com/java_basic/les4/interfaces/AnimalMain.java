package com.java_basic.les4.interfaces;

public class AnimalMain {

    public static void main(String[] args) {
        Chicken chicken = new Chicken(10l);
        System.out.println(chicken); // toString() дар ин ҷо пинҳон номида мешавад

        System.out.println();
        chicken.fly();
        chicken.land();

        System.out.println();
        chicken.sound();
        chicken.soundByDefault();

        System.out.println();
        chicken.run();
        chicken.jump();

        System.out.println();
        Sound.staticSound(); // усули интерфейси статикиро даъват кардан
        System.out.println(Flyable.LABEL);
    }
}
