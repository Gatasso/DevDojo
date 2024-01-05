package academy.devdojo.exercicios.jogocartas.service;

import academy.devdojo.exercicios.jogocartas.domain.Card;
import academy.devdojo.exercicios.jogocartas.domain.Player;

public class Game {
    private Player[] players;
    private final Games gameMod;
    private int indexDeck = 0;

    public Game(Player[] players, Card[] shuffledDeck, Games gameMod) {
        this.players = players;
        this.gameMod = gameMod;
        if (players.length > gameMod.NUMBER_OF_PLAYERS || shuffledDeck == null) {
            System.out.println("Não foi possível criar o Baralho");
            return;
        }
        setupCards(shuffledDeck);
    }

    public Game(Card[] shuffledDeck,Games gameMod) {
        this.gameMod = gameMod;
        createPlayers();
        if (players.length > gameMod.NUMBER_OF_PLAYERS || shuffledDeck == null) {
            System.out.println("Não foi possível criar o Baralho");
            return;
        }
        setupCards(shuffledDeck);
        printPlayerHands();
    }

    public void createPlayers(){
        this.players = new Player[gameMod.NUMBER_OF_PLAYERS];
        for (int i = 0; i < gameMod.NUMBER_OF_PLAYERS; i++) {
            int playerNumber = i+1;
            String playerName = "Player"+playerNumber;
            players[i] = new Player(playerName,gameMod);
        }
    }

    public void printPlayerHands(){
        System.out.println(this.gameMod);
        for (Player player : players) {
            System.out.println(player.toString());
        }
        System.out.println("***************************************************");
    }

    public void setupCards(Card[] gameDeck) {
        for (Player player : players) {
            for (int i = 0; i < gameMod.INITIAL_CARDS; i++) {
                if (indexDeck < gameDeck.length) {
                    player.setHand(gameDeck[indexDeck], i);
                    indexDeck++;
                }
            }
        }
    }
}
