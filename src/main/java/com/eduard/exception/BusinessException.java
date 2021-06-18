package com.eduard.exception;

public class BusinessException extends BankApiException{
    public BusinessException(int errorCode, String message) {
        super(errorCode, message);
    }
}
