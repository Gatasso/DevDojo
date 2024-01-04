package academy.devdojo.exercicios.jogocartas.test;

import academy.devdojo.exercicios.jogocartas.domain.Deck;
import academy.devdojo.exercicios.jogocartas.domain.Player;
import academy.devdojo.exercicios.jogocartas.service.Game;
import academy.devdojo.exercicios.jogocartas.service.Games;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        Player player1 = new Player("P1", Games.MORE_THAN);
        Player player2 = new Player("P2", Games.MORE_THAN);
        Player [] players = {player1,player2};
        Game game = new Game(players,deck1.getShuffledDeck(), Games.MORE_THAN);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(Arrays.toString(players));
        //criar teste para verificar se os jogadores estão recebendo as cartas iniciais
    }
}
