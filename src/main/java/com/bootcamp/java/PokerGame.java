package com.bootcamp.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PokerGame {
    private static final int NUMBER_OF_PLAYERS = 2;

    private CardPatternType patternType;

    private static final int MAX_NUM_OF_CARDS_PER_HAND =2;

    private Card[] board;

    private static final int NUMBER_OF_CARDS_ON_BOARD =5;

    private Player[] players;

    private Deck deck;

    private DeckFactory deckFactory;

    public PokerGame(Player[] players,Deck deck) {
        this.players = players;
        this.deck = deck;
        this.board = dealBoardCards();


    }

    public static void main(String[] args) {


        Deck deck1 = DeckFactory.createDeck();
        deck1.shuffle();
        Player[] players = new Player[NUMBER_OF_PLAYERS];
        Player player1 = new Player("Andy", deck1.dealMultipleTimes(MAX_NUM_OF_CARDS_PER_HAND));
        Player player2 = new Player("Billy", deck1.dealMultipleTimes(MAX_NUM_OF_CARDS_PER_HAND));
        players[0] = player1;
        players[1] = player2;
        PokerGame game = new PokerGame(players, deck1);
        Detector detector = new Detector(PredicateInitializer.predicatesInitialize());
        List<Card> player1List = Arrays.asList(player1.getHands());
        Card [] player1CombineArray = Stream.concat(Arrays.stream(game.getBoard()),Arrays.stream(player1.getHands())).toArray(Card[]:: new);
                // new Card[NUMBER_OF_CARDS_ON_BOARD+MAX_NUM_OF_CARDS_PER_HAND];
        Card [] player2CombineArray = Stream.concat(Arrays.stream(game.getBoard()),Arrays.stream(player2.getHands())).toArray(Card[]:: new);

        player1.setPattern(detector.detect(player1CombineArray));
        player2.setPattern(detector.detect(player2CombineArray));

//        for (Player player : players) {
//            Card[] mergedCards = Arrays.copyOf(game.getBoard(), game.getBoard().length + 2);
//            mergedCards[mergedCards.length - 2] = player.getHands()[0];
//            mergedCards[mergedCards.length - 1] = player.getHands()[1];
//            player.setPattern(detector.detect(mergedCards));
//        }


        System.out.println(player1.getPattern());
        System.out.println(player2.getPattern());





//        Player player1 = new Player("Andy", deck1.dealMultipleTimes(MAX_NUM_OF_CARDS_PER_HAND));
//        players[0]=player1;
//        System.out.println(Arrays.toString(player1.getHands()));
    }

    public Card[] dealBoardCards (){
        Card[] board = deck.dealMultipleTimes(NUMBER_OF_CARDS_ON_BOARD);
        return board;
    }

    public Card[] getBoard() {
        return board;
    }
}
