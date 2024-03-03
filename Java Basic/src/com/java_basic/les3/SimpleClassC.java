package com.java_basic.les3;

public class SimpleClassC {

    // Эъломияи хосияти клас, ки барои ҳама объектҳо маъмул аст
    private static Boolean classBooleanField = new Boolean(false);

    // Эъломияи блоки статики, танҳо 1 маротиба иҷро мешавад
    static {
        classBooleanField = new Boolean(true); // тағир додани арзиш
    }

    // Эъломияи усули клас, ки барои ҳама объектҳо маъмул аст
    public static Boolean classMethod() {
        return classBooleanField;
    }

    public static void main(String[] args) {
        Boolean value = SimpleClassC.classMethod(); // Мо номи класро барои занг задан ба усулҳо ё хосиятҳои
                                                    // намоёни статикӣ истифода мебарем
    }

}
