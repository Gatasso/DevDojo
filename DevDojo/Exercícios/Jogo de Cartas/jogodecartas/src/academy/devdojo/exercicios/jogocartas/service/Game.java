package academy.devdojo.exercicios.jogocartas.service;

import academy.devdojo.exercicios.jogocartas.domain.Card;
import academy.devdojo.exercicios.jogocartas.domain.Deck;
import academy.devdojo.exercicios.jogocartas.domain.Player;

public class Game {
    private Player[] players;
    private Player player;
    private Card[] deck;
    private ModeGame gameMod;

    public Game(Player[] players, Card[] deck, ModeGame gameMod) {
        this.players = players;
        this.deck = deck;
        this.gameMod = gameMod;
        setupCards();
    }

    public void setupCards() {
        int index = 0;
        for (Player eachPlayer : players) {
            player.initialCard(gameMod.INITIAL_CARDS,deck[index]);
            index++;
        }
    }
}
