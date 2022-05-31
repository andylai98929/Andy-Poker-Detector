package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.*;

public class RoyalFlushPredicate implements PatternPredicates{

    @Override
    public boolean checkCardPattern(PredicateRequest request) {
        Card.Suit straightFlushSuit = findSuitForFlush(request.getCards());
        Comparator<Card.Rank> compareByRankValue = new Comparator<Card.Rank>() {
            @Override
            public int compare(Card.Rank c1, Card.Rank c2) {
                return Integer.compare(c1.getValue(),c2.getValue()); // for treemap
            }
        };

        Set<Card.Rank> royalFlushSet = new TreeSet<>(compareByRankValue);
        royalFlushSet.add(Card.Rank.ACE);
        royalFlushSet.add(Card.Rank.KING);
        royalFlushSet.add(Card.Rank.QUEEN);
        royalFlushSet.add(Card.Rank.JACK);
        royalFlushSet.add(Card.Rank.TEN);



        Set<Card.Rank> straightTreeSet = new TreeSet<>(compareByRankValue);
        for (Card card : request.getCards()){
            if (card.getSuit()==straightFlushSuit){
                straightTreeSet.add(card.getRank());
            }
        }


        Card.Rank[] straightArray = straightTreeSet.toArray(Card.Rank[]::new);
        int consecutiveCount = 0;
        for (int i = 1, len = straightArray.length; i < len; i++) {
            if (straightArray[i].getValue() - straightArray[i - 1].getValue() == 1) {
                consecutiveCount++;
            } else {
                consecutiveCount = 0;
            }
        }

        if (consecutiveCount==4){
            return straightTreeSet.containsAll(royalFlushSet);
        }

        return false;
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.ROYAL_FLUSH;
    }

    public Map<Card.Suit, Integer> suitCount (Card[] cards){
        Map<Card.Suit, Integer> flushHistogram = new HashMap<>();
        for (Card card : cards) {
            flushHistogram.put(card.getSuit(), flushHistogram.getOrDefault(card.getSuit(), 0) + 1);
        }
        return flushHistogram;
    }

    public boolean checkIsFlush(Card[] cards) {
        Map<Card.Suit, Integer> flushHistogram = suitCount(cards);
        for (Integer value : flushHistogram.values()) {
            if (value >= 5) {
                return true;
            }
        }
        return false;
    }

    public Card.Suit findSuitForFlush (Card[] cards) {
        Map<Card.Suit, Integer> flushHistogram = suitCount(cards);
        while (checkIsFlush(cards)) {
            for (Map.Entry<Card.Suit, Integer> entry : flushHistogram.entrySet() ){
                if (entry.getValue()>=5){
                    return entry.getKey();
                }
            }
        }
        return null;
    }
}
