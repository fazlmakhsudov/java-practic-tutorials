package com.java_basic.les4.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)             // он дар вақти рантайм дастрас аст
@Target({ElementType.TYPE, ElementType.METHOD}) // ба клас ва усулхо татбик кардан мумкин аст
public @interface NotAbstract {
}

@NotAbstract
class D {

    @NotAbstract                       // онро ба хосияти клас татбиқ кардан мумкин нест
    private short shortField;

    @NotAbstract                       // онро ба созандаи клас татбиқ кардан мумкин нест
    public D(short shortField) {
        this.shortField = shortField;
    }

    @NotAbstract
    public void method() {
        //баъзе амали
    }
}
