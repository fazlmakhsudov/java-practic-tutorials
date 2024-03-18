package com.java_basic.les4.interfaces;

import com.java_basic.les4.enums.AnimalEnum;

public abstract class AbstractAnimal {

    private AnimalEnum abstractField;

    public AbstractAnimal(AnimalEnum value) {
        this.abstractField = value;
    }

    public abstract void run();

    public void jump() {
        System.out.println("Ҳайвон ҷаҳида истодааст");
    }

    public AnimalEnum getAbstractField() {
        return abstractField;
    }
}
