package com.eduard.service;

import com.eduard.dto.NewCardDTO;
import com.eduard.entity.CardEntity;
import com.eduard.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{
    @Autowired
    CardRepository cardRepository;
    @Autowired
    AccountService accountService;

    public void add(NewCardDTO newCardDTO) {
        cardRepository.save(new CardEntity(accountService.getAccount(newCardDTO.getAccountNumber()),
                newCardDTO.getCardNumber(),
                newCardDTO.getCardHolder()));
    }

    public void getList(String accountNumber) {
        cardRepository.fin
    }
}
