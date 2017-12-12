package com.example.OneToOne.repository;

import com.example.OneToOne.domain.bidirection.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}
