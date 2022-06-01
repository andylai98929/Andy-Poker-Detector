package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;

import java.util.*;
import java.util.stream.Collectors;

public class PredicateRequest {
    private static final Comparator<Card.Rank> COMPARE_BY_RANK_VALUE = Comparator.comparingInt(Card.Rank::getValue);

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

    public Card.Rank[] getSortedCardRanks() {
        Set<Card.Rank> straightTreeSet = new TreeSet<>(COMPARE_BY_RANK_VALUE);
//        Set<Card.Rank> straightTreeSet2 = Arrays.stream(getCards())
//                .map(Card::getRank)
//                .collect(Collectors.toCollection(
//                        () -> new TreeSet<>(COMPARE_BY_RANK_VALUE)
//                ));

        for (Card card : getCards()){
            straightTreeSet.add(card.getRank());
        }

        return straightTreeSet.toArray(Card.Rank[]::new);
    }
}
