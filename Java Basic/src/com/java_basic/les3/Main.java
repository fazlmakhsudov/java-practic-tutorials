package com.java_basic.les3;

public class Main {

    public static void main(String[] args) {
        SimpleClassB obj = new SimpleClassB();

        // Тафтиши тағирдиҳандаҳои дастрасии хосиятҳо
        int value = obj.publicInstanceField;
        value = obj.protectedInstanceField;
        value = obj.packagePrivateInstanceField;
        value = obj.privateInstanceField;            // Ин хосият барои дастрасӣ ноаён аст

        // Тафтиши тағирдиҳандаҳои дастрасии усулҳо
        obj.getPublicInstanceField();
        obj.getProtectedInstanceField();
        obj.getPackagePrivateInstanceField();
        obj.getPrivateInstanceField();              // Ин усул барои дастрасӣ ноаён аст

        value = obj.getValueFromPrivateField();      // Мо метавонем арзишро аз хосияти хусусӣ гирем
        obj.getValueFromPrivateMethod();            // Мо метавонем арзишро аз усули хусусӣ гирем
    }

}
