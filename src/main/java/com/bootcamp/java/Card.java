package com.bootcamp.java;

import java.util.Objects;

public class Card implements Comparable<Card>{
    private final Suit suit;
    private final Rank rank;

    private Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static Card of(Suit suit, Rank rank){
        return new Card(suit, rank);
    }


    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getRankValue(){
        return rank.getValue();
    }

    public int getSuitValue(){
        return suit.getValue();
    }

    public int getStrengthValue(){
        return getRankValue()*getSuitValue();
    }

    @Override
    public String toString() {
        return String.format("[%s of %s]", rank , suit);
    }

    @Override
    public int compareTo(Card c2) {
        return Integer.compare(getStrengthValue(), c2.getStrengthValue());
    }
//        if (suit==c2.getSuit()) {
//            return Integer.compare(rank.getValue(), c2.getRank().getValue());
//        }
//        return Integer.compare(suit.getValue(), c2.getSuit().getValue());
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    //    public static void main(String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
    enum Suit{
        SPADE(4),
        HEART(3),
        CLUB(2),
        DIAMOND(1);

        private final int value;

        Suit(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum Rank{
        ACE(14),
        KING(13),
        QUEEN(12),
        JACK(11),
        TEN(10),
        NINE(9),
        EIGHT(8),
        SEVEN(7),
        SIX(6),
        FIVE(5),
        FOUR(4),
        THREE(3),
        TWO(2);

        private final int value;

        Rank(int value){
            this.value=value;
        }

        public int getValue() {
            return value;
        }
    }
}


