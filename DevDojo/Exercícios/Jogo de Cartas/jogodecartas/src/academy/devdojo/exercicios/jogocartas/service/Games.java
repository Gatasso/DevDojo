package academy.devdojo.exercicios.jogocartas.service;

import academy.devdojo.exercicios.jogocartas.domain.Player;

public enum Games {
    MORE_THAN(2, 2),
    BLACKJACK(3, 3);

    public final int NUMBER_OF_PLAYERS, INITIAL_CARDS;

    Games(int NUMBER_OF_PLAYERS, int INITIAL_CARDS) {
        this.NUMBER_OF_PLAYERS = NUMBER_OF_PLAYERS;
        this.INITIAL_CARDS = INITIAL_CARDS;
    }
}
