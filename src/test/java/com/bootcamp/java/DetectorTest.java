package com.bootcamp.java;

import com.bootcamp.java.predicates.PatternPredicates;
import com.bootcamp.java.predicates.PredicateRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetectorTest {

    @Test
    public void shouldDetectPatternAndReturnType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.ACE);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        Detector detector = new Detector(PredicateInitializer.predicatesInitialize()); // should I construct a detector like this?
        PredicateRequest request = new PredicateRequest(cards);
        assertEquals(CardPatternType.STRAIGHT_FLUSH, detector.detect(cards));



    }

}
