package com.java_basic.les7.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {

    public static void main(String[] args) {
        SomeClass someClassObject = new SomeClass(2024, "April", 28.04d);
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("src/resources/serialized.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ){
            objectOutputStream.writeObject(someClassObject);
            objectOutputStream.flush();
            System.out.println("Объект сериализатсия карда шуд ва захира шуд дар файли 'serialized.txt'.");
        } catch (IOException ex) {
            System.err.println("Файл эҷод карда намешавад.");
        }
    }
}
