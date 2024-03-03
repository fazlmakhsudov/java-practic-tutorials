package com.java_basic.les3;

public class SimpleClassB {

    // Эъломияи хосиятҳо бо тағирдиҳандаҳои дастрасии гуногун
    public Integer publicInstanceField;
    protected Integer protectedInstanceField;
    Integer packagePrivateInstanceField;
    private Integer privateInstanceField;

    // Эъломия усулҳо бо тағирдиҳандаҳои дастрасии гуногун
    public Integer getPublicInstanceField() {
        return this.publicInstanceField;
    }

    protected Integer getProtectedInstanceField() {
        return this.protectedInstanceField;
    }

    Integer getPackagePrivateInstanceField() {
        return this.packagePrivateInstanceField;
    }

    private Integer getPrivateInstanceField() {
        return this.privateInstanceField;
    }

    // Ин усул дастрасӣ ба хосияти хусусиро таъмин мекунад
    public Integer getValueFromPrivateField() {
        return this.privateInstanceField;
    }

    // Ин усул дастрасӣ ба усули хусусиро таъмин мекунад
    public Integer getValueFromPrivateMethod() {
        return this.getValueFromPrivateField();
    }

}
