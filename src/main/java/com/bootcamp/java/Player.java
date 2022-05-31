package com.bootcamp.java;

public class Player {
    private String name;

    private final Card[] hands ;

    private CardPatternType pattern;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getHands() {
        return hands;
    }

//    public void setHands(Card[] hands) {
//        this.hands = hands;
//    }

    public CardPatternType getPattern() {
        return pattern;
    }

    public void setPattern(CardPatternType pattern) {
        this.pattern = pattern;
    }

    public Player(String name, Card[] hands) {
        this.name = name;
        this.hands = hands;
        this.pattern = CardPatternType.HIGH_CARD;
    }
}
