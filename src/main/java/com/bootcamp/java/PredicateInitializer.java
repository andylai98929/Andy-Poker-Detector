package com.bootcamp.java;


import com.bootcamp.java.predicates.*;

public class PredicateInitializer {

    public static PatternPredicates[] predicatesInitialize (){
        return new PatternPredicates[]{
                new CheatPredicate(),
                new RoyalFlushPredicate(),
                new StraightFlushPredicate(),
                new QuadsPredicate(),
                new FullHousePredicate(),
                new FlushPredicate(),
                new StraightPredicate(),
                new ThreeOfAKindPredicate(),
                new TwoPairPredicate(),
                new OnePairPredicate(),
        };
    }

}
