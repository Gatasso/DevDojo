package academy.devdojo.exercicios.jogocartas.domain;

import academy.devdojo.exercicios.jogocartas.service.Games;

import java.util.Arrays;

public class Player {
    private String name;
    private Card[] hand;

    /****************************************************************
     constructors */
    public Player(String name, Games gameMod) {                                         // A player its only a Player with cards on hand and a name to call it
        this.name = name;
        hand = new Card[gameMod.INITIAL_CARDS];
    }

    /****************************************************************
     methods*/
    @Override                                                                          // Shows the Player name and initial Hand
    public String toString() {
        return name + ", hand=" + Arrays.toString(hand);
    }

    /****************************************************************
     getters and setters*/
    public void setHand(Card newCard, int i) {
        this.hand[i] = newCard;
    }
}

