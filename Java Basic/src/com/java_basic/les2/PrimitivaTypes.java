package com.java_basic.les2;

public class PrimitivaTypes {

    //барои нигоҳ доштани рақамҳои бутун
    private byte byteType;
    private short shortType;
    private int intType;
    private long longType;

    //барои нигоҳ доштани рақамҳои нуқтаи шинокунанда
    private float floatType;
    private double doubleType;

    //барои нигоҳ доштани рамзҳо
    private char charType;

    //барои нигоҳ доштани ду ҳолати устувор - ҳақиқӣ ва бардурӯғ
    private boolean booleanType;

    public byte getByteType() {
        return byteType;
    }

    public short getShortType() {
        return shortType;
    }

    public int getIntType() {
        return intType;
    }

    public long getLongType() {
        return longType;
    }

    public float getFloatType() {
        return floatType;
    }

    public double getDoubleType() {
        return doubleType;
    }

    public char getCharType() {
        return charType;
    }

    public boolean isBooleanType() {
        return booleanType;
    }

    public void setByteType(byte byteType) {
        this.byteType = byteType;
    }

    public void setShortType(short shortType) {
        this.shortType = shortType;
    }

    public void setIntType(int intType) {
        this.intType = intType;
    }

    public void setLongType(long longType) {
        this.longType = longType;
    }

    public void setFloatType(float floatType) {
        this.floatType = floatType;
    }

    public void setDoubleType(double doubleType) {
        this.doubleType = doubleType;
    }

    public void setCharType(char charType) {
        this.charType = charType;
    }

    public void setBooleanType(boolean booleanType) {
        this.booleanType = booleanType;
    }

    public static void main(String[] args) {
        int varInt = 12;
        System.out.println("Арзиши тағирёбандаи varInt: " + varInt);

        float varFloat = 12;
        System.out.println("Арзиши тағирёбандаи varFloat: " + varFloat);

        System.out.println("\nТағйирёбандаи намуди int метавонад арзишро аз " + Integer.MIN_VALUE
        + " то " + Integer.MAX_VALUE);

        // Табдилдиҳии мустақими намуди, васеъшавӣ
        byte varByte = 1;

        short varShort = varByte;

        char varChar = 'a';

        varInt = varByte;
        varInt = varShort;
        varInt = varChar;

        long varLong = varByte;
        varLong = varShort;
        varLong = varInt;
        varLong = varChar;

        varFloat = 1;
        varFloat = varChar;
        varFloat = varInt;
        varFloat = varLong;

        double varDouble = 1;
        varDouble = varFloat;
        varDouble = varInt;
        varDouble = varLong;

        int varSum = varInt + varByte; // if int sum byte, then int

        // Табдилдиҳии ба намудхои хурд

        varSum = (int) (varInt + varLong); // casting

        varFloat = 1.22f;
        varInt = (int) varFloat;
        System.out.println(String.format("\nПеш аз тангшавии намуди тағирёбанда арзиши он буд %.2f," +
                " \nбаъд шуд %d, \nарзиш тағйир ёфт ба %.2f", varFloat, varInt, varFloat - varInt));

    }
}
