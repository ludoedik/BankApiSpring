package com.eduard.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    AccountService accountService() {
        return new AccountServiceImpl();
    }

    CardService cardService() {
        return new CardServiceImpl();
    }
}
