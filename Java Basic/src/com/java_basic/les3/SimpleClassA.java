package com.java_basic.les3;

public class SimpleClassA {

    // Эъломияи хосиятҳои объект
    private Double doubleValue;
    private Long longValue;

    // Эъломияи блок, ҳар дафъа ҳангоми сохтани объект иҷро мешавад
    {
        doubleValue = new Double(12d);    // арзишро ба тағирёбандаи объект муқаррар кунед

        // block variables
        int blockIntVar = 123;
        long blockLongVar = calculateSum(blockIntVar, doubleValue).longValue(); // занг ба усули объект
                                                                     //намуди Double бармегардад
                                                                     // занг ба усули класи Double барои гирифтани
                                                                     // арзиши намуди Long
    }

    // Эъломияи усул
    private Double calculateSum(int a, Double b) {
        Double methodDoubleVar = new Double(18d); // хосияти усул
        return a + b + methodDoubleVar;
    }

    // Эъломияи созанда
    // изофабори
    public SimpleClassA() {
        // созандаи пешфарз (нобаён)
    }

    public SimpleClassA(Double val) {
        this.doubleValue = val;
    }

    public SimpleClassA(Double doubleValue, Long longValue) {
        this.doubleValue = doubleValue;
        this.longValue = longValue;
    }

    public static void main(String[] args) {
        SimpleClassA objA = new SimpleClassA();
        System.out.println(String.format("doubleValue = %.2f, longValue = %d", objA.doubleValue, objA.longValue));

        SimpleClassA objB = new SimpleClassA(1d);
        System.out.println(String.format("doubleValue = %.2f, longValue = %d", objB.doubleValue, objB.longValue));

        SimpleClassA objC = new SimpleClassA(1d, 18l);
        System.out.println(String.format("doubleValue = %.2f, longValue = %d", objC.doubleValue, objC.longValue));
    }

}
