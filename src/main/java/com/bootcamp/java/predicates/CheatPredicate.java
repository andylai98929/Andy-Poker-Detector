package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CheatPredicate implements PatternPredicates {
    @Override
    public boolean checkCardPattern(PredicateRequest request) {
        Map<Card, Integer> duplicateCounts = Arrays.stream(request.getCards())
                .collect(Collectors.toMap(
                        card -> card,
                        card -> 1,
                        Integer::sum
                ));
        return duplicateCounts.values().stream().anyMatch(i -> i > 1);
    }


    @Override
    public CardPatternType getType() {
        return CardPatternType.CHEATING;
    }
}
