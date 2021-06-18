package com.eduard.dto;

public class CardDTO {
    private final int id;
    private final String cardNumber;

    public CardDTO(int id, String cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
