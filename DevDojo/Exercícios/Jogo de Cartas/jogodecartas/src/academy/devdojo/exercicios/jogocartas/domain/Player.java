package academy.devdojo.exercicios.jogocartas.domain;

import academy.devdojo.exercicios.jogocartas.service.Games;

import java.util.Arrays;

public class Player {
    private String name;
    private Card[] hand;


    public Player(String name, Games gameMod) {
        this.name = name;
        hand = new Card[gameMod.INITIAL_CARDS];
    }

    @Override
    public String toString() {
        return name + ", hand=" + Arrays.toString(hand);
    }

//    public Card[] getHand() {
//        return hand;
//    }

    public void setHand(Card newCard, int i) {
        this.hand[i] = newCard;
    }
}

