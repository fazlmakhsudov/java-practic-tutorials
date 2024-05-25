package com.java_basic.les8;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueMain {

    public static void main(String[] args) {

        // Example 1
        LinkedList<String> queueObject1 = new LinkedList<>();

        queueObject1.add("Карим");
        queueObject1.add("Акмал");
        queueObject1.add("Дильшод");
        queueObject1.add("Баходур");

        for (String element : queueObject1) {
            System.out.println("foreach queueObject1: " + element);
        }

        System.out.println("queueObject1.poll() : " + queueObject1.poll()); // Сарлавҳаи (элементи аввал) ин навбат дарёфт ва хориҷ мекунад
        System.out.println("queueObject1.element() : " + queueObject1.element()); //Сарлавҳаи (элементи аввал) ин навбат дарёфт мекунад, аммо нест намекунад.
        System.out.println("queueObject1.peek() : " + queueObject1.peek()); // Сарлавҳаи (элементи аввал) ин навбат дарёфт мекунад, аммо нест намекунад.
        System.out.println("queueObject2.offer() : " + queueObject1.offer("Икром")); // Элементи муайяншударо ҳамчун дум (элементи охирин)-и ин навбат илова мекунад
        System.out.println();

        // Example 2
        PriorityQueue<String> queueObject2 = new PriorityQueue<>();

        queueObject2.add("Карим");
        queueObject2.add("Акмал");
        queueObject2.add("Дильшод");
        queueObject2.add("Баходур");

        for (String element : queueObject2) {
            System.out.println("foreach queueObject2: " + element);
        }

        System.out.println("queueObject2.poll() : " + queueObject2.poll());
        System.out.println("queueObject2.element() : " + queueObject2.element());
        System.out.println("queueObject2.peek() : " + queueObject2.peek());
        System.out.println("queueObject2.offer() : " + queueObject2.offer("Икром"));

    }
}
