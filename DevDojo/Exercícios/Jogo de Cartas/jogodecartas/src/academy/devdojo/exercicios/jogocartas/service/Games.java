package academy.devdojo.exercicios.jogocartas.service;

import academy.devdojo.exercicios.jogocartas.domain.Player;

public enum Games implements GameRules {
    MORE_THAN(3, 3) {
        @Override
        public Player winCondition(Player[] players) {
            int[] positionPlayer = new int[NUMBER_OF_PLAYERS];
            int index = 0, maxAt = 0;
            for (Player player : players) {
                positionPlayer[index] = player.getTotalValueCards();
                index++;
            }
            for (int i = 1; i < positionPlayer.length; i++) {
                if (positionPlayer[i]>positionPlayer[maxAt]){
                    maxAt = i;
                }
            } return players[maxAt];
        }
    },
    BLACKJACK(3, 2) {
        @Override
        public Player winCondition(Player[] players) {
            return players[0];
        }
    };

    public final int NUMBER_OF_PLAYERS, INITIAL_CARDS;

    /****************************************************************
     constructors */
    Games(int NUMBER_OF_PLAYERS, int INITIAL_CARDS) {
        this.NUMBER_OF_PLAYERS = NUMBER_OF_PLAYERS;
        this.INITIAL_CARDS = INITIAL_CARDS;
    }
}

