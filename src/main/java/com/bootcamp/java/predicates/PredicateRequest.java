package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PredicateRequest {

    private final Card[] cards;

    private final Map<Card.Rank, Integer> rankCounts;

    private final Map<Card.Suit, Integer> suitCounts;


    public PredicateRequest(Card[] cards) {
        Card[] copyOfCards = Arrays.copyOf(cards,cards.length);
        this.cards = Arrays.copyOf(cards, cards.length);
        this.rankCounts = initRankCounts(copyOfCards);
        this.suitCounts = initSuitCounts(copyOfCards);
    }


    public Map<Card.Rank, Integer> initRankCounts(Card[] cards) {
        Map<Card.Rank, Integer> rankCountHistogram = new HashMap<>();
        for (Card card : cards){
            rankCountHistogram.put(card.getRank(), rankCountHistogram.getOrDefault(card.getRank(),0)+1);
        }
        return rankCountHistogram;
    }

    public Map<Card.Suit, Integer> initSuitCounts(Card[] cards) {
        Map<Card.Suit, Integer> suitCountHistogram = new HashMap<>();
        for (Card card : cards) {
            suitCountHistogram.put(card.getSuit(), suitCountHistogram.getOrDefault(card.getSuit(), 0) + 1);
        }
        return suitCountHistogram;
    }

    public Card[] getCards() {
        return cards;
    }

    public Map<Card.Rank, Integer> getRankCounts() {
        return rankCounts;
    }

    public Map<Card.Suit, Integer> getSuitCounts() {
        return suitCounts;
    }
}
