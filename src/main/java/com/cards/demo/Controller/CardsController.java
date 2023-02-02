package com.cards.demo.Controller;

import com.cards.demo.Model.Cards;
import com.cards.demo.Model.Customer;
import com.cards.demo.Repository.CardsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController{

    @Autowired
    private CardsRepo cardsRepo;

    @PostMapping("/api/get")
    public Cards get(Customer customer) {
        Cards newcard = cardsRepo.findById(customer.getCustomerId());
        return  newcard;
    }

    @GetMapping("/api/get/{id}")
    public Cards get(@PathVariable int id) {
        Cards newcard = cardsRepo.findById(id);
        return  newcard;
    }
}
