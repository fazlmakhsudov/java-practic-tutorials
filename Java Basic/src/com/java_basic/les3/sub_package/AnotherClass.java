package com.java_basic.les3.sub_package;

import com.java_basic.les3.SimpleClassB;

public class AnotherClass extends SimpleClassB {

    public void verifyAccessModifier() {
        // Тафтиши тағирдиҳандаҳои дастрасии хосиятҳо
        int value = super.publicInstanceField;
        value = super.protectedInstanceField;
        value = super.packagePrivateInstanceField;      // Ин хосият барои дастрасӣ ноаён аст
        value = super.privateInstanceField;             // Ин хосият барои дастрасӣ ноаён аст

        // Тафтиши тағирдиҳандаҳои дастрасии усулҳо
        super.getPublicInstanceField();
        super.getProtectedInstanceField();
        super.getPackagePrivateInstanceField();       // Ин усул барои дастрасӣ ноаён аст
        super.getPrivateInstanceField();              // Ин усул барои дастрасӣ ноаён аст
    }

}
