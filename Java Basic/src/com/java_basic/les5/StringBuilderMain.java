package com.java_basic.les5;

public class StringBuilderMain {

    public static void main(String[] args) {
        StringBuilder obj1 = new StringBuilder();

        obj1.append(1);
        obj1.append('a');
        obj1.append(2);
        obj1.append("b");
        obj1.append(3);
        obj1.append(false);

        System.out.println(obj1.toString());

        obj1.reverse();
        System.out.println(obj1);
        obj1.reverse();
        System.out.println(obj1);

        System.out.println(obj1.charAt(1));
        System.out.println(obj1.deleteCharAt(1));
        System.out.println(obj1.charAt(1));

    }
}
