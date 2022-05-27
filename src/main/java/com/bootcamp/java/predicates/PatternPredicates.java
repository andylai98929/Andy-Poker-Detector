package com.bootcamp.java.predicates;

import com.bootcamp.java.CardPatternType;

public interface PatternPredicates {
    boolean checkCardPattern();

    CardPatternType getType();

    static boolean isStraight() {
        return false;
    }

}
