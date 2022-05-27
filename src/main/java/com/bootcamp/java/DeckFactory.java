package com.bootcamp.java;

import java.util.ArrayList;
import java.util.List;

public class DeckFactory {
    private static final int MAX_NUM_CARDS = 52;


//    public Deck() {
//        this.MAX_NUM_CARDS = 52;
//        this.deck = new ArrayList<>(MAX_NUM_CARDS);
//    }



    public static Deck createDeck(){
        List<Card> cards = new ArrayList<>(MAX_NUM_CARDS);
        for (Card.Suit suit: Card.Suit.values()){
            for (Card.Rank rank : Card.Rank.values()){
                cards.add(Card.of(suit,rank));
            }
        }
        return new Deck(cards);
    }



//    public void init (){
//        for (Card.Suit suit : Card.Suit.values()){
//            for (Card.Rank rank : Card.Rank.values()){
//                deck.add(Card.of(suit,rank));
//            }
//        }
//
//    }
//
//    public void reset(){
//        deck.clear();
//        ;
//    }






}
