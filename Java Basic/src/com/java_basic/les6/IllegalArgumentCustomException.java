package com.java_basic.les6;

public class IllegalArgumentCustomException extends Exception {

    public IllegalArgumentCustomException(String message) {
        super(message);
    }

    public IllegalArgumentCustomException(String message, Throwable cause) {
        super(message, cause);
    }

}
