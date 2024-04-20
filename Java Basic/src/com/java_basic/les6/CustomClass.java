package com.java_basic.les6;

public class CustomClass {

    // Эълон кардани истисно аз бахши throws усул
    private void throwCustomExceptionWhenNullArgument(Object argument) throws CustomException {
        if (argument == null) {
            throw new CustomException("Аргумент беэътибор аст");
        }
    }

    //Гирифтан ва коркарди истисноҳо дар блок try-catch
    private void throwCustomRuntimeExceptionWhenNullArgument(Object argument) {
        try {
            throwCustomExceptionWhenNullArgument(argument);
        } catch (CustomException ex) {
            throw new CustomRuntimeException("Аргумент беэътибор аст", ex); // RuntimeException ба коркарди возеҳ ниёз надорад
        }
    }

    //Гирифтан ва коркарди истисноҳо дар блок try-catch
    private void throwIllegialArgumentExceptionWhenNullArgument(Object argument) throws IllegalArgumentCustomException {
        try {
            throwCustomExceptionWhenNullArgument(argument);
        } catch (CustomException ex) {
            throw new IllegalArgumentCustomException("Аргумент беэътибор аст");
        }
    }

    // Эълон кардани истисно аз бахши throws усул
    public void someMethodOne(Object argument) throws CustomException {
        throwCustomExceptionWhenNullArgument(argument);
        // баъзе код
    }

    public void someMethodTwo(Object argument) {
        throwCustomRuntimeExceptionWhenNullArgument(argument);
        // баъзе код
    }

    // Эълон кардани истисно аз бахши throws усул
    public void someMethodThree(Object argument) throws IllegalArgumentCustomException {
        throwIllegialArgumentExceptionWhenNullArgument(argument);
        // баъзе код
    }

}
