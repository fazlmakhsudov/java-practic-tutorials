package com.java_basic.les2;

public class WrapperClasses {

    //барои нигоҳ доштани рақамҳои бутун
    private Byte byteType;
    private Short shortType;
    private Integer integerType;
    private Long longType;

    //барои нигоҳ доштани рақамҳои нуқтаи шинокунанда
    private Float floatType;
    private Double doubleType;

    //барои нигоҳ доштани рамзҳо
    private Character characterType;

    //барои нигоҳ доштани ду ҳолати устувор - ҳақиқӣ ва бардурӯғ
    private Boolean booleanType;

    public Byte getByteType() {
        return byteType;
    }

    public Short getShortType() {
        return shortType;
    }

    public Integer getIntegerType() {
        return integerType;
    }

    public Long getLongType() {
        return longType;
    }

    public Float getFloatType() {
        return floatType;
    }

    public Double getDoubleType() {
        return doubleType;
    }

    public Character getCharacterType() {
        return characterType;
    }

    public Boolean getBooleanType() {
        return booleanType;
    }

    public void setByteType(Byte byteType) {
        this.byteType = byteType;
    }

    public void setShortType(Short shortType) {
        this.shortType = shortType;
    }

    public void setIntegerType(Integer integerType) {
        this.integerType = integerType;
    }

    public void setLongType(Long longType) {
        this.longType = longType;
    }

    public void setFloatType(Float floatType) {
        this.floatType = floatType;
    }

    public void setDoubleType(Double doubleType) {
        this.doubleType = doubleType;
    }

    public void setCharacterType(Character characterType) {
        this.characterType = characterType;
    }

    public void setBooleanType(Boolean booleanType) {
        this.booleanType = booleanType;
    }

    public static void main(String[] args) {
        System.out.println("Намуди маълумоти byte: " + (Byte.SIZE/8) + " байт хотираро ишғол мекунад.");
        System.out.println("Намуди маълумоти short: " + (Short.SIZE/8) + " байт хотираро ишғол мекунад.");
        System.out.println("Намуди маълумоти int: " + (Integer.SIZE/8) + " байт хотираро ишғол мекунад.");
        System.out.println("Намуди маълумоти long: " + (Long.SIZE/8) + " байт хотираро ишғол мекунад.");

        System.out.println("Намуди маълумоти float: " + (Float.SIZE/8) + " байт хотираро ишғол мекунад.");
        System.out.println("Намуди маълумоти double: " + (Double.SIZE/8) + " байт хотираро ишғол мекунад.");

        System.out.println("Намуди маълумоти char: " + (Character.SIZE/8) + " байт хотираро ишғол мекунад.");

        System.out.println("\nДар хотир доред, ки андозаи намудҳои ибтидоӣ ва печандае онхо " +
                "\nдар Java ҳамеша як хел аст. Java аз платформае, ки дар он кор \nмекунад, мустақил аст.");

        // Autoboxing ва Unboxing
        int intValue = 2024; // Эълони тағирёбандаи намуди ибтидоӣ, муқаррар кардан арзиш ба он
        Integer integerWrapper = intValue; // Эълони тағирёбандаи намуди печанда, муқаррар кардан арзиш ба он,
                                           // табдили номуайян
        integerWrapper = new Integer(20130);// Autoboxing, табдили муайян
        integerWrapper = new Integer(intValue);
        intValue = integerWrapper; // Unboxing, табдили номуайяни баръакс (бозгашт)
        intValue = integerWrapper.intValue(); //Unboxing, табдили баръакс бо истифода аз усули клас

        double doubleValue = 2024d;
        Double doubleWrapper = doubleValue;
        doubleWrapper = new Double(323112);
        doubleWrapper = new Double(doubleValue);
        doubleValue = doubleWrapper;
        doubleValue = doubleWrapper.doubleValue();

    }

}
