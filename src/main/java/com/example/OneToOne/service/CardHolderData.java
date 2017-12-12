package com.example.OneToOne.service;

import com.example.OneToOne.domain.bidirection.CardHolder;
import com.example.OneToOne.domain.bidirection.CardHolderDetails;
import com.example.OneToOne.repository.CardHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CardHolderData implements CommandLineRunner {
    @Autowired
    private CardHolderRepository cardHolderRepository;

    @Override
    public void run(String... args) throws Exception {
        CardHolder cardHolder = new CardHolder();
        cardHolder.setId(1L);
        cardHolder.setEmail("jacky@gmail.com");
        cardHolder.setPassword("password1");

        CardHolderDetails cardHolderDetails = new CardHolderDetails();
        cardHolderDetails.setName("Lucky Luck");
        cardHolderDetails.setDateOfBirth("10/10/1970");
        cardHolderDetails.setPhoneNumber("001 9383 93838");
        cardHolderDetails.setCardHolder(cardHolder); // Important

        cardHolder.setCardHolderDetails(cardHolderDetails);
        cardHolderRepository.save(cardHolder);

        cardHolderRepository.findById(1L);

        // Can not delete cardHolder b/c CardHolderDetails depends on
        // it by sharing primary key. Try to delete CardHolderDetails first,
        // then for cardHolder.
        // cardHolderRepository.delete(cardHolder);
    }
}
