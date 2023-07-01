package com.exceptionhandeling;

public class NegativeRadiusException extends Exception {
    @Override
    public String getMessage() {
        return "Cannot take negative radius.";
    }
    @Override
    public String toString() {
        String s = getClass().getName();
        String message = getLocalizedMessage();
        return (message != null)? (s + ": " + message) : s;
    }
}
