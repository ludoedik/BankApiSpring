package com.eduard.service;

import com.eduard.dto.NewCardDTO;

public interface CardService {
    public void add(NewCardDTO dto);
    public void getList(String accountNumber);
}
