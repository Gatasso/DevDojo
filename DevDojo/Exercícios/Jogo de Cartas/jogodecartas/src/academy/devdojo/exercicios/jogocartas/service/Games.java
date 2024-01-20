package academy.devdojo.exercicios.jogocartas.service;

import academy.devdojo.exercicios.jogocartas.domain.Player;

public enum Games implements GameRules{
    MORE_THAN(2, 2) {
        @Override
        public Player winCondition(Player[] players) {
            int index = 0;
            int[] positionPlayer = new int[NUMBER_OF_PLAYERS];
                for (Player player : players) {
                    positionPlayer[index] =  player.getTotalValueCards();
                    index++;
                }
            if (positionPlayer[0] > positionPlayer[1]){
                return players[0];
            } else if (positionPlayer[0] < positionPlayer[1]) {
                return players[1];
            }else return null;
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

