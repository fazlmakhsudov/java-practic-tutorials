package com.java_basic.les7.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationMain {

    public static void main(String[] args) {
        try (
                FileInputStream fileInputStream = new FileInputStream("src/resources/serialized.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ){
            SomeClass someObject = (SomeClass) objectInputStream.readObject(); // reading object from file
            System.out.println("Объект десериализатсия карда шуд.");
            System.out.println(someObject);
        } catch (IOException ex) {
            System.err.println("File was not found."); // Standard error output stream
        } catch (ClassNotFoundException e) {
            System.err.println("Cannot be casted to SomeClass type."); // Standard error output stream
        }
    }
}
