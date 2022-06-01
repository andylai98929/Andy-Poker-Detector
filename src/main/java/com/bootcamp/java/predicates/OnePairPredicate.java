package com.bootcamp.java.predicates;


import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.HashMap;
import java.util.Map;

public class OnePairPredicate implements PatternPredicates{
    @Override
    public boolean checkCardPattern(PredicateRequest request) {
//        Map<Card.Rank, Integer> onePairHistogram = new HashMap<>();
//        for (Card card : cards){
//            onePairHistogram.put(card.getRank(), onePairHistogram.getOrDefault(card.getRank(),0)+1);
//        }



        int countOfPairs = 0;
        for (Integer value : request.getRankCounts().values()){
            if (value>=2){
                countOfPairs++;
            }
        }
        if (countOfPairs>=1){
            return true;
        }
        return false;

//        return request.getRankCounts().values().stream()
//                .anyMatch(i -> i >= 2);
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.ONE_PAIR;
    }





}
