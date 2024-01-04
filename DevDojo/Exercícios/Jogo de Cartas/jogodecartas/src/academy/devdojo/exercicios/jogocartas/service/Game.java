package academy.devdojo.exercicios.jogocartas.service;

import academy.devdojo.exercicios.jogocartas.domain.Card;
import academy.devdojo.exercicios.jogocartas.domain.Player;

public class Game {
    private Player[] players;
    private Games gameMod;
    private int indexDeck = 0;

    public Game(Player[] players, Card[] shuffledDeck, Games gameMod) {
        this.players = players;
        this.gameMod = gameMod;
        setupCards(shuffledDeck);
    }
    public void setupCards(Card[] gameDeck) {
        for (Player player : players) {
            for (int i = 0; i < gameMod.INITIAL_CARDS; i++) {
                player.setHand(gameDeck[indexDeck],i);
                indexDeck++;
            }
        }
    }
}
