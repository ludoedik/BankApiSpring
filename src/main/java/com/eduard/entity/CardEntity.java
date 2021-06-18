package com.eduard.entity;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountEntity account;
    private String cardNumber;
    private String cardHolder;

    public CardEntity(AccountEntity account, String cardNumber, String cardHolder) {
        this.account = account;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    public CardEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
}
