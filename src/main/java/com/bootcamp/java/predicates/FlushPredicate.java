package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.HashMap;
import java.util.Map;

public class FlushPredicate implements PatternPredicates{
    @Override
    public boolean checkCardPattern(PredicateRequest request) {
//        Map<Card.Suit, Integer> flushHistogram = new HashMap<>();
//        for (Card card : cards) {
//            flushHistogram.put(card.getSuit(), flushHistogram.getOrDefault(card.getSuit(), 0) + 1);
//        }
//        int countOfFlush = 0;
        for (Integer value : request.getSuitCounts().values()) {
            if (value >= 5) {
//                countOfFlush++;
//            }
//        }
//        if (countOfFlush==1){
                return true;
            }

        }
        return false;
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.FLUSH;
    }
}
