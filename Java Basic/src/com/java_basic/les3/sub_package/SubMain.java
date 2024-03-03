package com.java_basic.les3.sub_package;

import com.java_basic.les3.SimpleClassB;

public class SubMain {

    public static void main(String[] args) {
        SimpleClassB objB = new SimpleClassB();

        // Тафтиши тағирдиҳандаҳои дастрасии хосиятҳо
        int value = objB.publicInstanceField;
        value = objB.protectedInstanceField;          // Ин хосият барои дастрасӣ ноаён аст
        value = objB.packagePrivateInstanceField;     // Ин хосият барои дастрасӣ ноаён аст
        value = objB.privateInstanceField;            // Ин хосият барои дастрасӣ ноаён аст

        // Тафтиши тағирдиҳандаҳои дастрасии усулҳо
        objB.getPublicInstanceField();
        objB.getProtectedInstanceField();            // Ин усул барои дастрасӣ ноаён аст
        objB.getPackagePrivateInstanceField();       // Ин усул барои дастрасӣ ноаён аст
        objB.getPrivateInstanceField();              // Ин усул барои дастрасӣ ноаён аст
    }

}
