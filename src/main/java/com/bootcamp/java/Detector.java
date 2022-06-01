package com.bootcamp.java;

import com.bootcamp.java.predicates.PatternPredicates;
import com.bootcamp.java.predicates.PredicateRequest;

public class Detector {

    private final PatternPredicates [] predicates;


    public Detector(PatternPredicates[] predicates) {
        this.predicates = predicates;
    }

    public CardPatternType detect(Card [] cards){
        CardPatternType type = CardPatternType.HIGH_CARD;
        PredicateRequest request = new PredicateRequest(cards);
        for (PatternPredicates predicate : predicates){
            if (predicate.checkCardPattern(request)){
                type = predicate.getType();
                break;
            }
        }


        return type;
    }

}
