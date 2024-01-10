package academy.devdojo.exercicios.jogocartas.domain;

import java.util.Random;

public class Deck {
    private final int DECK_SIZE = TypeCards.values().length * TypeSuits.values().length;
    private Card[] deck;
    private Card[] shuffledDeck;

    /****************************************************************
     constructors */
    public Deck() {                                                                     // The constructor of the deck involves the creation of all playable cards, as well the shuffling of then
        create();
        shuffle();
//        printShuffledDeck();
    }

    /****************************************************************
     methods*/
    public void create() {                                                              // All cards must have a Name and a Suit, implementing the respective Enums in a for loop
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

    public void shuffle() {                                                             //  Using the java.util.Random algorithm to pick a random card and storing in a new Deck array
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

    private boolean verifyShuffle(int randomCard, int currentIndex) {                   //  This method is useful to check the random card picked by the random algorithm and repick if its repeated before store in array
        for (int i = 0; i < currentIndex; i++) {
            if (shuffledDeck[i] != null && deck[randomCard].equals(shuffledDeck[i])) {
                return false;
            }
        }
        return true;
    }

    public void printShuffledDeck() {                                                   // using this method to test and see all bugs, but later I will use this for more functions
        for (Card card : shuffledDeck) {
            System.out.println(card);
        }
    }

    /****************************************************************
     getters and setters*/
    public int getLengthOfDeck() {
        return shuffledDeck.length;
    }

    public Card[] getShuffledDeck() {
        return shuffledDeck;
    }
}


