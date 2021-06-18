package com.eduard.exception;

public class BankApiException extends RuntimeException{
    private final int errorCode;

    public BankApiException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
