package com.eduard.controller;

import com.eduard.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/test")
    public String getSomething (@RequestParam(value = "yo") String str) {
        return str;
    }
}
