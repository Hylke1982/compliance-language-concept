package com.example.compliance.definition.exception;

public class UndefinedControlException extends RuntimeException {
    public UndefinedControlException(String controlName) {
        super(String.format("Control \"%s\" cannot be found.", controlName));
    }
}
