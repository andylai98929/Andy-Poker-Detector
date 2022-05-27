package com.bootcamp.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {
    @Test
    public void shouldShuffle(){
        Deck unshuffled = DeckFactory.createDeck();
        Deck shuffled = DeckFactory.createDeck();
        shuffled.shuffle();
//        assertEquals(unshuffled, shuffled);
        assertNotEquals(unshuffled, shuffled);

    }

//    public

//    public void shouldContainNecessaryCards(){
//        assertEquals(52, );
//        assertTrue();
//    }
}
