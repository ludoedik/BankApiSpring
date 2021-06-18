package com.eduard.dto;

public class NewCardDTO {
    private String cardNumber;
    private String accountNumber;
    private String cardHolder;

    public NewCardDTO() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public NewCardDTO(String cardNumber, String accountNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.cardHolder = cardHolder;
    }
}
