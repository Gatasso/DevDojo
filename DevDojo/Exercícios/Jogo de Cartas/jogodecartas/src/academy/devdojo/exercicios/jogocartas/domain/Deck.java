package academy.devdojo.exercicios.jogocartas.domain;

import java.util.Random;

public class Deck {
    private final int DECK_SIZE = TypeCards.values().length * TypeSuits.values().length;
    private Card[] deck;
    private Card[] shuffledDeck;

    public Deck() {
        create();
        shuffle();
//        printShuffledDeck();
    }

    public void create() {
        deck = new Card[DECK_SIZE];
        int index = 0;
        for (TypeCards typeCard : TypeCards.values()) {
            for (TypeSuits suit : TypeSuits.values()) {
                Card newCard = new Card(typeCard, suit);
                deck[index] = newCard;
                index++;
            }
        }
    }

    public void shuffle() {
        shuffledDeck = new Card[DECK_SIZE];
        Random randomSequence = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCard;
            do {
                randomCard = randomSequence.nextInt(deck.length);
            } while (!verifyShuffle(randomCard, i));
            shuffledDeck[i] = deck[randomCard];
        }
    }

    private boolean verifyShuffle(int randomCard, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (shuffledDeck[i] != null && deck[randomCard].equals(shuffledDeck[i])) {
                return false;
            }
        }
        return true;
    }

    public void printShuffledDeck() {
        for (Card card : shuffledDeck) {
            System.out.println(card);
        }
    }

    public int getLengthOfDeck(){
        return shuffledDeck.length;
    }

    public Card[] getShuffledDeck() {
        return shuffledDeck;
    }
}


