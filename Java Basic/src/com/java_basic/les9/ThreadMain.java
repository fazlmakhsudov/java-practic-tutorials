package com.java_basic.les9;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMain {

    public static void main(String[] args) {
        // Мисоли 1
        RunnableCustomClass runnableCustomClass1 = new RunnableCustomClass();

        Thread thread1 = new Thread(runnableCustomClass1);

        thread1.start(); // оғоз кардани чараени иҷро

        // Мисоли 2
        CustomThreadOne customThreadOne1 = new CustomThreadOne();

        Thread thread2 = new Thread(customThreadOne1);

        thread2.start(); // оғоз кардани чараени иҷро

        // Мисоли 3
        CallableCustomClass callableCustomClass1 = new CallableCustomClass();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<String> result = executor.submit(callableCustomClass1); // мукаррар намудани оғози оғози чараени иҷро
        try {
            String value = result.get();
            System.out.println("\nАрзиши баргардонидани чараени иҷроиши Callable аст: '" + value + "'");

            executor.shutdown(); // shutdown executor
        } catch (InterruptedException | ExecutionException e) {
            System.err.println(e.getMessage());
        }
    }
}
