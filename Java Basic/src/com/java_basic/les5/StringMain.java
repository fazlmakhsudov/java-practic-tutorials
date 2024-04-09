package com.java_basic.les5;

public class StringMain {

    public static void main(String[] args) {
        String obj1 = new String();
        String obj2 = new String("object 2");
        String obj3 = "object 3";

        System.out.println(String.format("obj1 - '%s', obj2 - '%s', obj3 - '%s'", obj1, obj2, obj3));

        System.out.println(String.format("method length(): obj1 - '%d', obj2 - '%d', obj3 - '%d'", obj1.length(),
                obj2.length(), obj3.length()));

        System.out.println(String.format("method isEmpty(): obj1 - '%b', obj2 - '%b', obj3 - '%b'", obj1.isEmpty(),
                obj2.isEmpty(), obj3.isEmpty()));

        System.out.println(String.format("obj1.equals(obj2) - '%b', obj1.equals(obj3) - '%b', " +
                        "obj2.equals(obj3) - '%b'", obj1.equals(obj2), obj1.equals(obj3), obj2.equals(obj3)));
        System.out.println(String.format("obj1.equals('') - '%b', obj2.equalsIgnoreCase('ObjeCT 2') - '%b', " +
                        "obj3.equals('object 3') - '%b'", obj1.equals(""), obj2.equalsIgnoreCase("ObjeCT 2"),
                obj3.equals("object 3")));

        System.out.println("obj2.toUpperCase() - " + obj2.toUpperCase());

        System.out.println("obj2.substring(3) - " + obj2.substring(3));

        System.out.println("obj3.charAt(0), obj3.charAt(1) - " + obj3.charAt(0) + ", " + obj3.charAt(1));

        System.out.println("obj3.indexOf('o'), obj3.indexOf('b') - " + obj3.indexOf('o') + ", " + obj3.indexOf('b'));

        System.out.println("obj2.replace('o', 'a') - " + obj2.replace('o', 'a'));
    }
}
