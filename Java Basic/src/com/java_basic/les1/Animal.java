package com.java_basic.les1;

public class Animal {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void makeSound() {
        System.out.println("Хайвон садо медихад");
    }
}

class Dog extends Animal {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Саг садои 'гав-гав' медихад");
    }

}

class Runner {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setId(12);
        animal.makeSound();
        System.out.println("----");

        Dog dog = new Dog();
        dog.setId(16);
        dog.setName("Полвон");
        dog.makeSound();

    }

}
