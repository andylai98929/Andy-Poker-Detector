package com.bootcamp.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class CardTest {

    @Test
    public void shouldPrintCardInfoByToString() {
        assertEquals( "[ACE of SPADE]", Card.of(Card.Suit.SPADE,Card.Rank.ACE).toString() );
    }

    @Test
    public void shouldSortByStrengthOfCard(){
        assertEquals(1, Card.of(Card.Suit.SPADE, Card.Rank.ACE).compareTo(Card.of(Card.Suit.SPADE,Card.Rank.KING)));
        assertEquals(1, Card.of(Card.Suit.SPADE, Card.Rank.ACE).compareTo(Card.of(Card.Suit.HEART, Card.Rank.ACE)));
    }
}
