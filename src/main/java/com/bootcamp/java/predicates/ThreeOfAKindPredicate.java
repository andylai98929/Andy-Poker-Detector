package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.HashMap;
import java.util.Map;

public class ThreeOfAKindPredicate implements  PatternPredicates{

    @Override
    public boolean checkCardPattern(PredicateRequest request) {
//        Map<Card.Rank, Integer> threeOfAKindHistogram = new HashMap<>();
//        for (Card card : cards){
//            threeOfAKindHistogram.put(card.getRank(), threeOfAKindHistogram.getOrDefault(card.getRank(),0)+1);
//        }
        int countOfThreeOfAKind = 0;
        for (Integer value : request.getRankCounts().values()){
            if (value==3){
                countOfThreeOfAKind++;
            }
        }
        if (countOfThreeOfAKind==1){
            return true;
        }
        return false;
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.THREE_OF_A_KIND;
    }

}
