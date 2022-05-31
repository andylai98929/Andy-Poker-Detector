package com.bootcamp.java.predicates;

import com.bootcamp.java.Card;
import com.bootcamp.java.CardPatternType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface PatternPredicates {

    Set<Card.Rank> SMALLEST_STRAIGHT_RANK = new HashSet<>() {{
        add(Card.Rank.ACE);
        add(Card.Rank.TWO);
        add(Card.Rank.THREE);
        add(Card.Rank.FOUR);
        add(Card.Rank.FIVE);

    }};
    Set<Card.Rank> BIGGEST_STRAIGHT_RANK = new HashSet<>() {{
        add(Card.Rank.ACE);
        add(Card.Rank.KING);
        add(Card.Rank.QUEEN);
        add(Card.Rank.JACK);
        add(Card.Rank.TEN);
    }};

    boolean checkCardPattern(PredicateRequest request);

    CardPatternType getType();

    static boolean isStraight() {
        return false;
    }

}
