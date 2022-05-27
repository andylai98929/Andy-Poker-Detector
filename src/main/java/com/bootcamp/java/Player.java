package com.bootcamp.java;

public class Player {
    private String name;

    private Card[] hands ;

    private CardPattern pattern;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getHands() {
        return hands;
    }

    public void setHands(Card[] hands) {
        this.hands = hands;
    }

    public CardPattern getPattern() {
        return pattern;
    }

    public void setPattern(CardPattern pattern) {
        this.pattern = pattern;
    }

    public Player(String name, Card[] hands) {
        this.name = name;
        this.hands = hands;
//        this.pattern = NO_PATTERN;
    }
}
