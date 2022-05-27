package com.bootcamp.java;

import com.bootcamp.java.predicates.PatternPredicates;

public class Detector {

    private PatternPredicates [] predicates;


    public Detector(PatternPredicates[] predicates) {
        this.predicates = predicates;
    }

    public CardPatternType detect(Card[] cards){

        return CardPatternType.HIGH_CARD;
    }

}
