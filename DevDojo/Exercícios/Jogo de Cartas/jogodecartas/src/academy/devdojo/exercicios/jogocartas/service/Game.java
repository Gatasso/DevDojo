package academy.devdojo.exercicios.jogocartas.service;

import academy.devdojo.exercicios.jogocartas.domain.Card;
import academy.devdojo.exercicios.jogocartas.domain.Deck;
import academy.devdojo.exercicios.jogocartas.domain.Player;

public class Game {
    private Player[] players;
    private final Games gameMod;
    private int indexDeck = 0;
    /****************************************************************
     constructors */
    public Game(Player[] players, Card[] shuffledDeck, Games gameMod) {             // 1st version of the Games, thought it would be better to create the game after creating the entire environment, but it's good to test somethings
        this.players = players;
        this.gameMod = gameMod;
        if (players.length > gameMod.NUMBER_OF_PLAYERS || shuffledDeck == null) {
            System.out.println("Não foi possível criar o Baralho");
            return;
        }
        setupCards(shuffledDeck);
    }

    public Game(Card[] shuffledDeck,Games gameMod) {                                // 2nd version ,Improved the game system by creating the players after initialize the game, worth it
        this.gameMod = gameMod;
        createPlayers();
        if (players.length > gameMod.NUMBER_OF_PLAYERS || shuffledDeck == null) {
            System.out.println("Não foi possível criar o Baralho");
            return;
        }
        setupCards(shuffledDeck);
        printPlayerHands();
    }

    public Game(Games gameMod) {                                                    // 3rd version, and probably the final one of the overloading constructors, only receiving the game mod, creating the deck, cards and players after initialize
        this.gameMod = gameMod;
        createPlayers();
        Deck gameDeck = new Deck();
//        gameDeck.printShuffledDeck();
        if (players.length > gameMod.NUMBER_OF_PLAYERS){
            System.out.println("Não foi possível criar o Baralho");
            return;
        }
        setupCards(gameDeck);
    }

    /****************************************************************
     methods*/
    public void createPlayers(){                                                    // Create the players referencing the enum parameter for NUM_MAX_Players and store them to the players array giving the name and passing the game mod chosen
        this.players = new Player[gameMod.NUMBER_OF_PLAYERS];
        for (int i = 0; i < gameMod.NUMBER_OF_PLAYERS; i++) {
            int playerNumber = i+1;
            String playerName = "Player"+playerNumber;
            players[i] = new Player(playerName,gameMod);
        }
    }

    public void printPlayerHands(){                                                 // Prints the players cards, but every player in game, not one specific
        System.out.println(this.gameMod);
        for (Player player : players) {
            System.out.println(player.toString());
        }
        System.out.println("***************************************************");
    }

    public void setupCards(Card[] gameDeck) {                                      //  This method sends the initial card to the players
        for (Player player : players) {
            for (int i = 0; i < gameMod.INITIAL_CARDS; i++) {
                if (indexDeck < gameDeck.length) {
                    player.setHand(gameDeck[indexDeck], i);
                    indexDeck++;
                }
            }
        }
    }
    public void setupCards(Deck gameDeck){                                          // 2nd version of the setupCards, but sending the cards of the Construtor Games Deck created
        for (Player player : players) {
            for (int i = 0; i < gameMod.INITIAL_CARDS; i++) {
                if (indexDeck < gameDeck.getLengthOfDeck()) {
                    player.setHand(gameDeck.getShuffledDeck()[indexDeck], i);
                    indexDeck++;
                }
            }
        }
        for (Player player : players) {                                             // this part shows the information of the player and your hand, but its only for testing
            System.out.println(player.toString());
        }
    }


}
