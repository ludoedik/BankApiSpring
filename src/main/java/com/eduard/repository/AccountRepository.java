package com.eduard.repository;

import com.eduard.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
    public AccountEntity findByAccountNumber(String accountNumber);
}
