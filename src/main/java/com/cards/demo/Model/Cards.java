package com.cards.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cards_demo")
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private   int cardId;
    private  int customerId;
    private  long cardNumber;
    private String cardName;
    private  String cardType;


}
