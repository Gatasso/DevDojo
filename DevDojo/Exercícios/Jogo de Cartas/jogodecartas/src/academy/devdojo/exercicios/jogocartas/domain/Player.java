package academy.devdojo.exercicios.jogocartas.domain;

import academy.devdojo.exercicios.jogocartas.service.Games;

import java.util.Arrays;

public class Player {
    private String name;
    private Games gameMod;
    private Card[] hand;


    public Player(String name, Games gameMod) {
        this.name = name;
        this.gameMod = gameMod;
        hand = new Card[gameMod.INITIAL_CARDS];
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", hand=" + Arrays.toString(hand);
    }

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card newCard, int i) {
        this.hand[i] = newCard;
    }
}

