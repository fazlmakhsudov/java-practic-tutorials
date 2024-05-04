package com.java_basic.les7;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
    public static void main(String[] args) {
        // Try with resources, аз Java 7, класҳои татбиқи интерфейси AutoClosable
        System.out.println("\n=== Try with resources, AutoClosable classes, SymbolStream ===");
        try (FileReader fileReader = new FileReader("src/resources/input-text.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            int inputInt;
            while ((inputInt = fileReader.read()) != -1) {
                stringBuilder.append(Character.toChars(inputInt));
            }
            System.out.println(stringBuilder);
        } catch (IOException ex) {
            System.err.println("Exception message: " + ex.getMessage()); // Standard error output stream
        }
    }
}
