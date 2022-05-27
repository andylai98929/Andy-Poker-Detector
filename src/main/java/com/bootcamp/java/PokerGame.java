package com.bootcamp.java;

import java.util.Arrays;

public class PokerGame {
    private int numberOfPlayer;

    private CardPatternType patternType;

    private static final int MAX_NUM_OF_CARDS_PER_HAND =2;

    private Card[] board;

    private Player[] players;

    private static Deck deck;

    private static DeckFactory deckFactory;

    public PokerGame(Player[] players) {
        this.players = players;
    }

    public static void main(String[] args) {
        Player[] players = new Player[1];
        PokerGame game = new PokerGame(players);
        Deck deck1 = DeckFactory.createDeck();
        Player player1 = new Player("Andy", deck1.dealMultipleTimes(MAX_NUM_OF_CARDS_PER_HAND));
        players[0]=player1;
        System.out.println(Arrays.toString(player1.getHands()));
    }


}
