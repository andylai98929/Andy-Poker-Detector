package com.bootcamp.java;


import com.bootcamp.java.predicates.OnePairPredicate;
import com.bootcamp.java.predicates.PatternPredicates;

public class PredicateInitializer {

    public PatternPredicates[] predicatesInitialize (){
        return new PatternPredicates[]{
                new OnePairPredicate()
        };
    }

}
