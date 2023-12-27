package academy.devdojo.aulas.associacao.teste;

import academy.devdojo.aulas.associacao.dominio.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador jogador3 = new Jogador("Romário");

//        Jogador[] jogadores = new Jogador[3];
          Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};
//        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador:jogadores) {
            jogador.imprime();

        }
    }
}
