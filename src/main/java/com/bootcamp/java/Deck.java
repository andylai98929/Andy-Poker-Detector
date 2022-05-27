package com.bootcamp.java;

import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

//    public List<Card> reset(){
//        cards.clear();
//        return DeckFactory.createDeck();
//    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card deal(){
        if (cards.isEmpty()){
            throw new IllegalStateException("Deck is Empty");
        }
        return cards.remove(0);
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card[] dealMultipleTimes (int times){
        Card[] hand = new Card[times];
        int i = 0;
        while (i<times){
            hand[i] = deal();
            i++;
        }
        return hand;

    }



}
