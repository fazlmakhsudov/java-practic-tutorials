package com.java_basic.les7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleSymbolStreamMain {

    public static void main(String[] args) {
        // System.in - ҷараёни стандартии интикол
        // System.out - ҷараёни стандартии кабул
        // System.err - ҷараёни стандартии хатогиҳо

        // Example 3: Истифодаи BufferedReader барои гирифтани вуруд аз корбар
        System.out.println("=== BufferedReader class ===");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Кабули матн
            System.out.print("Enter a string value: ");
            String inputString = reader.readLine();
            System.out.println("You entered string value: " + inputString);
            // Кабули раками бутун
            System.out.print("Enter an integer value: ");
            int inputInt = Integer.parseInt(reader.readLine());
            System.out.println("You entered integer value: " + inputInt);
            // Кабули раками касри
            System.out.print("Enter an float value: ");
            Float inputFloat = Float.parseFloat(reader.readLine());
            System.out.println("You entered float value: " + inputFloat);
        } catch (IOException e) {
            System.err.println("Exception message: " + e.getMessage());
        }
    }
}
