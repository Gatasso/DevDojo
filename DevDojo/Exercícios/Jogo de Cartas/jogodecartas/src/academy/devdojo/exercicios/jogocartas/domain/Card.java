package academy.devdojo.exercicios.jogocartas.domain;

public class Card {

    private final TypeCards cardName;
    private final TypeSuits cardSuit;

    public Card(TypeCards cardValue, TypeSuits cardSuit) {
        this.cardName = cardValue;
        this.cardSuit = cardSuit;
    }
    @Override
    public String toString() {
        return   cardName + " of " + cardSuit.getName();
    }
}
