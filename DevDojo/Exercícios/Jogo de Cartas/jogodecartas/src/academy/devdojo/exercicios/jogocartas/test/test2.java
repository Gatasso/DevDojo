package academy.devdojo.exercicios.jogocartas.test;

import academy.devdojo.exercicios.jogocartas.service.Game;
import academy.devdojo.exercicios.jogocartas.service.Games;

public class test2 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        Game game1 = new Game(Games.MORE_THAN);
        System.out.println("--------------------------------------");
        Game game2 = new Game(Games.BLACKJACK);
        System.out.println("--------------------------------------");

    }
}
