package com.java_basic.les6;

public class ExceptionMain {

    public static void main(String[] args) {
        CustomClass obj = new CustomClass();
        Integer argument1 = 1;
        String argument2 = "1";
        Double argument3 = 1d;

        // Мисол 1 бо CustomRuntimeException
        //Класҳои гурухи RuntimeException ба коркарди возеҳ ниёз надоранд
        obj.someMethodTwo(argument1);

        // Мисоли 2 бо CustomException ва IllegalArgumentCustomException ва МултиКетч
        // Класҳои гурухи Exception ба коркарди возеҳ ниёз доранд
        // Кисми барнома дар блоки finally ҳамеша иҷро мешаванд.
        try {
            obj.someMethodOne(argument2);
            obj.someMethodThree(argument3);
            // баъзе код
        } catch (CustomException customException) {                // Гирифтани истисно аз усули obj.someMethodOne(null)
            // тафсилоти сабт
            customException.printStackTrace();
            throw new IllegalArgumentException("Аргумент беэътибор аст");
        } catch (IllegalArgumentCustomException illegalArgumentCustomException) { // Гирифтани истисно аз усули obj.someMethodThree(null);
            // тафсилоти сабт
            illegalArgumentCustomException.printStackTrace();
            throw new IllegalArgumentException("Аргумент беэътибор аст");
        } finally {
            // тафсилоти сабт
            // баъзе код
            System.out.println("Кисми барнома дар блоки finally ҳамеша иҷро мешаванд.");
        }

        // Мисол 3 бо CustomException ва IllegalArgumentCustomException
        try {
            obj.someMethodOne(argument2);
            obj.someMethodThree(argument3);
            // баъзе код
        } catch (CustomException | IllegalArgumentCustomException exception) { // Рӯйхати истисно, ки коркарди якхела дорад
            // тафсилоти сабт
            exception.printStackTrace();
            throw new IllegalArgumentException("Аргумент беэътибор аст");
        } finally {
            // тафсилоти сабт
            // баъзе код
            System.out.println("Кисми барнома дар блоки finally ҳамеша иҷро мешаванд.");
        }

        // Мисоли 4 бо CustomException ва IllegalArgumentCustomException
        // Not recommended approach
        try {
            obj.someMethodOne(argument2);
            obj.someMethodThree(argument3);
            throw new IndexOutOfBoundsException("ин истисноро ҳамчун CustomException ё IllegalArgumentCustomException" +
                    " коркард кардан мумкин нест");
            //баъзе код
        } catch (Exception exception) { // Гирифтани ҳама истисноҳо аз гурӯҳи Exception
            // тафсилоти сабт
            exception.printStackTrace();
            throw new IllegalArgumentException("Аргумент беэътибор аст");
        } finally {
            // тафсилоти сабт
            // баъзе код
            System.out.println("Кисми барнома дар блоки finally ҳамеша иҷро мешаванд.");
        }
    }
}
