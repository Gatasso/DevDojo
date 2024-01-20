package academy.devdojo.exercicios.jogocartas.service;

import academy.devdojo.exercicios.jogocartas.domain.Player;

public interface GameRules {
    Player winCondition(Player[] players);
//    boolean verifyWinCondition(Player[] playersInGame);

}
