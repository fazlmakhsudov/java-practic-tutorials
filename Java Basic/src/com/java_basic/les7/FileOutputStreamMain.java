package com.java_basic.les7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamMain {
    public static void main(String[] args) {
        // Мисоли 1
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File("src/resources/output-text-1.txt");
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Ин чумла барои санчиш 1.".getBytes(StandardCharsets.UTF_8));
            System.out.println("File is created with given content.");
        } catch (FileNotFoundException e) {
            System.err.println("Exception message: " + e.getMessage()); // Standard error output stream
        } catch (IOException e) {
            System.err.println("Exception message: " + e.getMessage()); // Standard error output stream
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close(); // explicit stream closing
                } catch (IOException e) {
                    System.err.println("File stream cannot be closed");
                }
            }
        }

        // Мисоли 2
        // Try with resources, аз Java 7, класҳои татбиқи интерфейси AutoClosable
        System.out.println("\n=== Try with resources, AutoClosable classes ===");
        try (FileOutputStream fileOutputStream2 = new FileOutputStream("src/resources/output-text-2.txt")) {
            fileOutputStream2.write("Ин чумла барои санчиш 2.".getBytes(StandardCharsets.UTF_8));
            System.out.println("File is created with given content.");
        } catch (IOException ex) {
            System.err.println("Exception message: " + ex.getMessage()); // Standard error output stream
        }
    }
}
