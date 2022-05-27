package com.bootcamp.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeckFactoryTest {
    @Test
    public void shouldContainNecessaryCards(){
        assertEquals(52, DeckFactory.createDeck().getCards().size());
        assertTrue(DeckFactory.createDeck().getCards().contains(Card.of(Card.Suit.SPADE, Card.Rank.ACE)));
    }

}
