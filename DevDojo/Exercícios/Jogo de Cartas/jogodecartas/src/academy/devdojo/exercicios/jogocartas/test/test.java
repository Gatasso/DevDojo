package academy.devdojo.exercicios.jogocartas.test;

import academy.devdojo.exercicios.jogocartas.domain.Deck;
import academy.devdojo.exercicios.jogocartas.domain.Player;
import academy.devdojo.exercicios.jogocartas.service.Game;
import academy.devdojo.exercicios.jogocartas.service.Games;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        Game game1 = new Game(deck1.getShuffledDeck(), Games.MORE_THAN);
        Game game2 = new Game(deck2.getShuffledDeck(), Games.BLACKJACK);

//        Player player1 = new Player("P1", Games.BLACKJACK);
//        Player player2 = new Player("P2", Games.BLACKJACK);
//        Player player3 = new Player("P3", Games.BLACKJACK);
//        Player[] players = {player1, player2, player3};
//        Game game = new Game(players, deck1.getShuffledDeck(), Games.BLACKJACK);

//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);
//        System.out.println(Arrays.toString(players));
    }
}
