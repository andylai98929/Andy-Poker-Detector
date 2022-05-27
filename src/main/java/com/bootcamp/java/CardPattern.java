package com.bootcamp.java;

import java.util.Arrays;

public class CardPattern {
    private CardPatternType patternType;

    private Card[] cards;

    public CardPattern(CardPatternType patternType, Card[] cards) {
        this.patternType = patternType;
        this.cards = Arrays.copyOf(cards, cards.length);
    }

    public CardPatternType getPatternType() {
        return patternType;
    }

    public void setPatternType(CardPatternType patternType) {
        this.patternType = patternType;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "CardPattern{" +
                "patternType=" + patternType +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }
}
