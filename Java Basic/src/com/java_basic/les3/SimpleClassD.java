package com.java_basic.les3;

public final class SimpleClassD { // клас мерос гирифтан мумкин нест

    // Эъломияи хосияти класи доимӣ, ки барои ҳама объектҳо умумӣ аст
    private final static Boolean classBooleanConstantField = new Boolean(false);

    //Эъломияи тағирёбандаи доимӣ
    private final Character characterConstantValue = new Character('F');

    static {
        classBooleanConstantField = new Boolean(true); // Тағир додани арзиши хосияти доимӣ иҷозат дода намешавад
    }

    // Эъломияи блок, дар ҳар як эҷоди объект иҷро мешавад
    {
        this.characterConstantValue = new Character('A'); // Тағир додани арзиши хосияти доимӣ иҷозат дода намешавад
    }

    // Ин усули класро дар класҳои меросӣ дубора муайян кардан мумкин нест
    public final static Boolean classMethod() {
        return classBooleanConstantField;
    }

    // Ин усулро дар класҳои меросӣ дубора муайян кардан мумкин нест
    public final Character instanceMethod() {
        return this.characterConstantValue;
    }

}
