package com.java_basic.les7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {
    public static void main(String[] args) {
        // Мисоли 1
        File file = new File("src/resources/input-text.txt");
        if (!file.canRead()) {
            System.err.println("File doesn't exist");
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            StringBuilder stringBuilder = new StringBuilder();
            int inputInt;
            while ((inputInt = fileInputStream.read()) != -1) {
                stringBuilder.append(Character.toChars(inputInt));
            }
            System.out.println(stringBuilder);
        } catch (FileNotFoundException e) {
            System.err.println("Exception message: " + e.getMessage()); // Standard error output stream
        } catch (IOException e) {
            System.err.println("Exception message: " + e.getMessage()); // Standard error output stream
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close(); // возеҳ бастани ҷараён
                } catch (IOException e) {
                    System.out.println("File stream cannot be closed");
                }
            }
        }

        // Мисоли 2
        // Try with resources, аз Java 7, класҳои татбиқи интерфейси AutoClosable
        System.out.println("\n=== Try with resources, AutoClosable classes, ByteStream ===");
        try (FileInputStream fileInputStreamAutoClosable = new FileInputStream("src/resources/input-text.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            int inputInt;
            while ((inputInt = fileInputStreamAutoClosable.read()) != -1) {
                stringBuilder.append(Character.toChars(inputInt));
            }
            System.out.println(stringBuilder);
        } catch (IOException ex) {
            System.err.println("Exception message: " + ex.getMessage()); // Standard error output stream
        }
    }
}
