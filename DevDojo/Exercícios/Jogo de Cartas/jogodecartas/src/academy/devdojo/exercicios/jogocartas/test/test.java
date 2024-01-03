package academy.devdojo.exercicios.jogocartas.test;

import academy.devdojo.exercicios.jogocartas.domain.Deck;
import academy.devdojo.exercicios.jogocartas.domain.Player;
import academy.devdojo.exercicios.jogocartas.service.Game;
import academy.devdojo.exercicios.jogocartas.service.ModeGame;

public class test {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        Player [] players = {new Player("P1"),new Player("P2"),new Player("P3")};
        Game game = new Game(players,deck1.shuffledDeck, ModeGame.MORE_THAN);

        //criar teste para verificar se os jogadores estão recebendo as cartas iniciais
    }
}
