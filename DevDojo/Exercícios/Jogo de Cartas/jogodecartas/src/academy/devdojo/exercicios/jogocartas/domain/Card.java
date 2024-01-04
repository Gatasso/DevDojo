package academy.devdojo.exercicios.jogocartas.domain;

public class Card {

    private TypeCards cardName;
    private TypeSuits cardSuit;

    public Card(TypeCards cardValue, TypeSuits cardSuit) {
        this.cardName = cardValue;
        this.cardSuit = cardSuit;
    }
    @Override
    public String toString() {
        return   cardName + " of " + cardSuit.getName();
    }
}
