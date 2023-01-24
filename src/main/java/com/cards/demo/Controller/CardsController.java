package com.cards.demo.Controller;

import com.cards.demo.Model.Cards;
import com.cards.demo.Model.Customer;
import com.cards.demo.Repository.CardsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @Autowired
    private CardsRepo cardsRepo;

    @GetMapping("/api/getcards")
    public Cards getCardDetails(Customer customer) {
        Cards card = cardsRepo.findByCustomerId(customer.getCustomerId());
        return card;
    }

    @GetMapping("/api/get")
    public  String demo() {
        return  "This is second method in controller class";
    }


}
