package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PredicateTest {

    @Test
    public void shouldTestCheating() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.ACE);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.ACE);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        CheatPredicate cheatPredicate = new CheatPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(cheatPredicate.checkCardPattern(request));

    }

    @Test
    public void shouldTestOnePair() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.NINE);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        OnePairPredicate onePairPredicate = new OnePairPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(onePairPredicate.checkCardPattern(request));


    }

    @Test
    public void shouldTestTwoPair() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.TWO);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        TwoPairPredicate twoPairPredicate = new TwoPairPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(twoPairPredicate.checkCardPattern(request));


    }

    @Test
    public void shouldTestThreeOfAKind() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.ACE);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        ThreeOfAKindPredicate threeOfAKindPredicate = new ThreeOfAKindPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(threeOfAKindPredicate.checkCardPattern(request));


    }

    @Test
    public void shouldTestStraight() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.TEN);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.QUEEN);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        StraightPredicate straightPredicate = new StraightPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(straightPredicate.checkCardPattern(request));


    }// did not pass

    @Test
    public void shouldTestFlush() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        FlushPredicate flushPredicate = new FlushPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(flushPredicate.checkCardPattern(request));


    }

    @Test
    public void shouldTestFullHouse() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.ACE);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.TWO);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        FullHousePredicate fullHousePredicate = new FullHousePredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(fullHousePredicate.checkCardPattern(request));


    }

    @Test
    public void shouldTestQuads() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.ACE);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.ACE);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        QuadsPredicate quadsPredicate =new QuadsPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(quadsPredicate.checkCardPattern(request));


    }

    @Test
    public void shouldTestStraightFlush() {
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.CLUB, Card.Rank.ACE);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        StraightFlushPredicate straightFlushPredicate = new StraightFlushPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(straightFlushPredicate.checkCardPattern(request));
    }

    @Test
    public void shouldTestRoyalFlush() {
        Card c1 = Card.of(Card.Suit.DIAMOND, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.DIAMOND, Card.Rank.QUEEN);
        Card c5 = Card.of(Card.Suit.DIAMOND, Card.Rank.TEN);
        Card c6 = Card.of(Card.Suit.DIAMOND, Card.Rank.JACK);
        Card c7 = Card.of(Card.Suit.DIAMOND, Card.Rank.KING);
        Card[] cards = new Card[]{c1, c2, c3, c4, c5, c6, c7};
        RoyalFlushPredicate royalFlushPredicate = new RoyalFlushPredicate();
        PredicateRequest request = new PredicateRequest(cards);
        assertTrue(royalFlushPredicate.checkCardPattern(request));


    }// did not pass







}
