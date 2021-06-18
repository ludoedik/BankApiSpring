package com.eduard.repository;

import com.eduard.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<CardEntity, Integer> {

    List<CardEntity> findByAccountNumber();
}
