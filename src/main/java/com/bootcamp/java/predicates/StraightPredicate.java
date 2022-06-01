package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.*;

public class StraightPredicate implements PatternPredicates{
    @Override
    public boolean checkCardPattern(PredicateRequest request) {
        Card.Rank[] straightArray = request.getSortedCardRanks();

        int consecutiveCount = 0;
        for (int i = 1, len = straightArray.length; i < len; i++) {
            if (straightArray[i].getValue() - straightArray[i - 1].getValue() == 1) {
                consecutiveCount++;
            } else {
                consecutiveCount = 0;
            }
        }

        if (Set.of(straightArray).containsAll(SMALLEST_STRAIGHT_RANK)){
            return true;
        }else {
            return consecutiveCount >= 4;
        }
//        return consecutiveCount == 5;

//        return false;
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.STRAIGHT;
    }
}
