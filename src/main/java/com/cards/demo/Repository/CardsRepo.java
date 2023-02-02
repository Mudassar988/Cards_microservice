package com.cards.demo.Repository;

import com.cards.demo.Model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepo extends JpaRepository<Cards, Long> {
    Cards findById(long customerid);
}
