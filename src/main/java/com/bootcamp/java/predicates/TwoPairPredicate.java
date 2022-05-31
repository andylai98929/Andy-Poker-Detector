package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.HashMap;
import java.util.Map;

public class TwoPairPredicate implements PatternPredicates{

    @Override
    public boolean checkCardPattern(PredicateRequest request) {
//        Map<Card.Rank, Integer> twoPairHistogram = new HashMap<>();
//        for (Card card : cards){
//            twoPairHistogram.put(card.getRank(), twoPairHistogram.getOrDefault(card.getRank(),0)+1);
//        }
        int countOfPairs = 0;
        for (Integer value : request.getRankCounts().values()){
            if (value==2){
                countOfPairs++;
            }
        }
        if (countOfPairs>=2){ //because there is 7 cards, 3 pairs would have to find out the larger two pair and a high card
            return true;
        }
        return false;
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.TWO_PAIR;
    }

}
