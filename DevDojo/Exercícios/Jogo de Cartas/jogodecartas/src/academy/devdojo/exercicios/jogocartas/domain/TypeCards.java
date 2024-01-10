package academy.devdojo.exercicios.jogocartas.domain;

public enum TypeCards {
    ACE(1), KING(10), QUEEN(10), JACK(10),
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

    private int cardValue;
    /****************************************************************
     constructors */
    TypeCards(int cardValue) {
        this.cardValue = cardValue;
    }

    /****************************************************************
     getters and setters*/
    public int getCardValue() {
        return cardValue;
    }
}

