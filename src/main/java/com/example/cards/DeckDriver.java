package com.example.cards;

public class DeckDriver {

    public static void main(String[] args) {

        Deck cards = new StandardDeck();
        displayDeck(cards);

        cards.shuffle();
        displayDeck(cards);


    }

    // helper method for easier readability instead of just println cards
    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }
}
