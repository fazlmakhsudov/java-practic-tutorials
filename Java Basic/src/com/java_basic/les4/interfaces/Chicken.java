package com.java_basic.les4.interfaces;

import com.java_basic.les4.enums.AnimalEnum;

public class Chicken extends AbstractAnimal implements Flyable, Sound {

    private Long longField;

    public Chicken(Long longField) { // ҳатмӣ аст, ки ҳамон як рӯйхати созандаҳо ҳамчун супер класси абстрактӣ
        super(AnimalEnum.CHICKEN); // созандаи суперклассро даъват кардан
        this.longField = longField; // ба хосияти объект арзиш таъин кардан
    }

    // Муайян кардани рафтори усулҳои интерфейси Flyable
    @Override
    public void fly() {
        System.out.println("Мурғ парвоз кард");
    }

    @Override
    public void land() {
        System.out.println("Мурғ фуруд омад");
    }

    // Муайян кардани рафтори усулҳои интерфейси Sound
    @Override
    public void sound() {
        System.out.println("Хурус 'ку-ка-ре-ку' садо медиҳад");
    }

    @Override
    public void soundByDefault() {
        Sound.super.soundByDefault();
        // Муайян кардани рафтор
    }

    // Муайян кардани рафтори усулҳои класи AbstractAnimal
    @Override
    public void run() {
        System.out.println("Мурғ медавад");
    }

    @Override
    public void jump() {
        System.out.println("Мурғ ҷаҳида истодааст");
    }

    // Муайян кардани рафтори усулҳои супер класи Object
    @Override
    public String toString() {
        return String.format("longField = %d, abstractField = %s", this.longField, super.getAbstractField());
    }

}
