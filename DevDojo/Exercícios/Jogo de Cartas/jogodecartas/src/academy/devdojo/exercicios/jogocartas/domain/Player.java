package academy.devdojo.exercicios.jogocartas.domain;

import academy.devdojo.exercicios.jogocartas.service.ModeGame;

public class Player {
    private String name;
    public Card [] hand;

    public Player(String name, Card[]handCards) {
        this.name = name;
        this.hand = handCards;
    }

    public Player(String name) {
        this.name = name;
    }

    public void initialCard(int numberCards, Card newCard){
        for (int i = 0; i < numberCards; i++) {
            hand[i] = newCard;
        }
    }

    public String getName() {
        return name;
    }
}

