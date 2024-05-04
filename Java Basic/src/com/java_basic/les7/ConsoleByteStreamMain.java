package com.java_basic.les7;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleByteStreamMain {

    public static void main(String[] args) {
        // System.in - ҷараёни стандартии интикол
        // System.out - ҷараёни стандартии кабул
        // System.err - ҷараёни стандартии хатогиҳо

        // Example 1: Истифодаи DataInputStream барои гирифтани вуруд аз корбар
        System.out.println("=== DataInputStream class ===");
        DataInputStream reader = new DataInputStream(System.in);
        int inputInt = 0;
        try {
            // Кабули матн
            System.out.print("Enter a string value: ");
            String inputString = reader.readLine();
            System.out.println("You entered string value: " + inputString);
            // Кабули раками бутун
            System.out.print("Enter an integer value: ");
            inputInt = Integer.parseInt(reader.readLine());
            System.out.println("You entered integer value: " + inputInt);
            // Кабули раками касри
            System.out.print("Enter an float value: ");
            Float inputFloat = Float.parseFloat(reader.readLine());
            System.out.println("You entered float value: " + inputFloat);
        } catch (IOException e) {
            System.err.println("Exception message: " + e.getMessage());
        }

        // Example 2: Истифодаи Scanner барои гирифтани вуруд аз корбар
        System.out.println("=== Scanner class ===");
        Scanner in = new Scanner(System.in);
        // Кабули матн
        System.out.print("Enter a string value: ");
        String inputString = in.nextLine();
        System.out.println("You entered string value: " + inputString);
        // Кабули раками бутун
        System.out.print("Enter an integer value: ");
        inputInt = in.nextInt();
        System.out.println("You entered integer value: " + inputInt);
        // Кабули раками касри
        System.out.print("Enter an float value: ");
        Float inputFloat = in.nextFloat();
        System.out.println("You entered float value: " + inputFloat);
    }
}
