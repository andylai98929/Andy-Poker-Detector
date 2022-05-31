package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.*;

public class StraightPredicate implements PatternPredicates{
    @Override
    public boolean checkCardPattern(PredicateRequest request) {
        Comparator<Card.Rank> compareByRankValue = new Comparator<Card.Rank>() {
            @Override
            public int compare(Card.Rank c1, Card.Rank c2) {
                return Integer.compare(c1.getValue(),c2.getValue()); // for treemap
            }
        };

        Set<Card.Rank> straightTreeSet = new TreeSet<>(compareByRankValue);
        for (Card card : request.getCards()){
            straightTreeSet.add(card.getRank());
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

        if (straightTreeSet.containsAll(SMALLEST_STRAIGHT_RANK)){
            return true;
        }else {
            return consecutiveCount == 4;
        }
//        return consecutiveCount == 5;

//        return false;
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.STRAIGHT;
    }
}
