package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.HashMap;
import java.util.Map;

public class FullHousePredicate implements PatternPredicates{
    @Override
    public boolean checkCardPattern(PredicateRequest request) {
//        Map<Card.Rank, Integer> fullHouseHistogram = new HashMap<>();
//        for (Card card : cards){
//            fullHouseHistogram.put(card.getRank(), fullHouseHistogram.getOrDefault(card.getRank(),0)+1);
//        }
        int countOfPairs = 0;
        for (Integer value : request.getRankCounts().values()){
            if (value==2){
                countOfPairs++;
            }
        }
        int countOfThreeOfAKind = 0;
        for (Integer value : request.getRankCounts().values()){
            if (value==3){
                countOfThreeOfAKind++;
            }
        }
        if (countOfPairs>=1 && countOfThreeOfAKind==1 || countOfThreeOfAKind==2){ //because there is 7 cards, two different three of a kind is also a full house
            return true;
        }
        return false;
    }

    @Override
    public CardPatternType getType() {
        return CardPatternType.FULL_HOUSE;
    }

}
