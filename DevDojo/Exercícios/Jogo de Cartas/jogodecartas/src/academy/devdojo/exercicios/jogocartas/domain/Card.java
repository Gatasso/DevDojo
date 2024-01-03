package academy.devdojo.exercicios.jogocartas.domain;

public class Card {
    private Deck deck;
    private TypeCards cardName;
    private TypeSuits cardSuit;

    public Card(TypeCards cardValue, TypeSuits cardSuit) {
        this.cardName = cardValue;
        this.cardSuit = cardSuit;
    }

    public Card(Deck deck, TypeCards cardValue, TypeSuits cardSuit) {
        this.deck = deck;
        this.cardName = cardValue;
        this.cardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return   cardName + " of " + cardSuit.getName();
    }
}
