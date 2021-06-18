package com.eduard.controller;

import com.eduard.dto.CardDTO;
import com.eduard.dto.NewCardDTO;
import com.eduard.exception.BusinessException;
import com.eduard.exception.UnexpectedServerException;
import com.eduard.service.CardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CardController {
    @Autowired
    private CardServiceImpl cardServiceImpl;

    @PostMapping(path = "/card/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity add(@RequestBody NewCardDTO newCardDTO) {
        try {
            cardServiceImpl.add(newCardDTO);
        }
        catch (UnexpectedServerException exception) {
            ResponseEntity.status(exception.getErrorCode());
        }
        catch (BusinessException exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
        return ResponseEntity.ok("Карта добавлена");
    }

    @GetMapping(path = "/card/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CardDTO> getAll (@RequestParam(name = "accountNumber") String accountNumber) {
        try {
            cardServiceImpl.getList(accountNumber);
        }
        catch (UnexpectedServerException exception) {
            ResponseEntity.status(exception.getErrorCode());
        }
        catch (BusinessException exception) {
            //return ResponseEntity.badRequest().body(exception.getMessage());
        }
        //return ResponseEntity.ok("Карта добавлена");
        return new ArrayList<CardDTO>();
    }
}