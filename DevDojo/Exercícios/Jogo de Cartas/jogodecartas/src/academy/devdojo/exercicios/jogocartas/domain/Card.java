package academy.devdojo.exercicios.jogocartas.domain;

public class Card {
    private final TypeCards cardName;
    private final TypeSuits cardSuit;

    /****************************************************************
     constructors */
    public Card(TypeCards cardValue, TypeSuits cardSuit) {   // Cards must have a name and suit, the value is implicit by the name(ex: ACE = 1)
        this.cardName = cardValue;
        this.cardSuit = cardSuit;
    }

    /****************************************************************
     methods*/
    @Override
    public String toString() {                              // Right way to call the Card
        return cardName + " of " + cardSuit.getName();
    }

    /****************************************************************
     getters and setters*/
    public int getCardValue() {                             // This method takes the implicit Card value to implement logics, additions, etc..
        return cardName.getCardValue();
    }
}
