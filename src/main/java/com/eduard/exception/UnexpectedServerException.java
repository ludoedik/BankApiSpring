package com.eduard.exception;

public class UnexpectedServerException extends BankApiException{
    public UnexpectedServerException(int errorCode, String message) {
        super(errorCode, message);
    }
}
