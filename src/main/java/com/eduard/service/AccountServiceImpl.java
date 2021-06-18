package com.eduard.service;

import com.eduard.entity.AccountEntity;
import com.eduard.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository repository;

    public AccountEntity getAccount(String accountNumber) {
        return repository.findByAccountNumber(accountNumber);
    }
}
