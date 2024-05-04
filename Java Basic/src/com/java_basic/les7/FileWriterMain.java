package com.java_basic.les7;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    public static void main(String[] args) {
        // Мисоли 3
        // Try with resources, аз Java 7, класҳои татбиқи интерфейси AutoClosable
        System.out.println("\n=== Try with resources, AutoClosable classes ===");
        try (FileWriter fileWriter = new FileWriter("src/resources/output-text-3.txt")) {
            fileWriter.write("Ин чумла барои санчиш 3.");
            System.out.println("File is created with given content.");
        } catch (IOException ex) {
            System.err.println("Exception message: " + ex.getMessage()); // Standard error output stream
        }
    }
}
