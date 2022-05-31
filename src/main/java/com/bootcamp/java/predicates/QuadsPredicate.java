package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.HashMap;
import java.util.Map;

public class QuadsPredicate implements  PatternPredicates{

    @Override
    public boolean checkCardPattern(PredicateRequest request) {
//        Map<Card.Rank, Integer> quadsHistogram = new HashMap<>();
//        for (Card card : cards){
//            quadsHistogram.put(card.getRank(), quadsHistogram.getOrDefault(card.getRank(),0)+1);
//        }
        int countOfQuads = 0;
        for (Integer value : request.getRankCounts().values()){
            if (value==4){
                countOfQuads++;
            }
        }
        if (countOfQuads==1){
            return true;
        }
        return false;
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.QUADS;
    }


}
