package com.bootcamp.java.predicates;


import com.bootcamp.java.CardPatternType;

public class OnePairPredicate implements PatternPredicates{
    @Override
    public boolean checkCardPattern() {
        return false;
    }

    @Override
    public CardPatternType getType() {
        return null;
    }
}
