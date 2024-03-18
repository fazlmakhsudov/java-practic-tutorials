package com.java_basic.les4.annotations;

public class A {

    public void print() {
        //баъзе амали
    }
}

class B extends A {

    @Override               //он тафтиш мекунад, ки класи волидайн дорои усули дорои чунин сигнатура мебошад
    public void print() {
        //баъзе амали
    }

    @Override              // компилятор ҳушдор медиҳад, ки дар класи волидайн чунин усул бо сигнатура вуҷуд надорад
    public void read() {
        //баъзе амали
    }
}
