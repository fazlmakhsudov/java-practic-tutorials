package com.java_basic.les2;

public class Main {

    public static void main(String[] args) {
        // Эъломия ду объекти синфҳои PrimitivesTypes ва WrapperClasses
        PrimitivaTypes primitives = new PrimitivaTypes();
        WrapperClasses wrappers = new WrapperClasses();

        // Арзишҳои пешфарз барои намудҳои ибтидоӣ ва печандаҳо
        System.out.println("\nАрзиши пешфарз барои намуди int - " + primitives.getIntType());
        System.out.println("Арзиши пешфарз барои намуди Integer - " + wrappers.getIntegerType());

        System.out.println("\nАрзиши пешфарз барои намуди double - " + primitives.getDoubleType());
        System.out.println("Арзиши пешфарз барои намуди Double - " + wrappers.getDoubleType());

        System.out.println("\nАрзиши пешфарз барои намуди char - " + primitives.getCharType());
        System.out.println("Арзиши пешфарз барои намуди Character - " + wrappers.getCharacterType());

        System.out.println("\nАрзиши пешфарз барои намуди boolean - " + primitives.isBooleanType());
        System.out.println("Арзиши пешфарз барои намуди Boolean - " + wrappers.getBooleanType());
    }

}
