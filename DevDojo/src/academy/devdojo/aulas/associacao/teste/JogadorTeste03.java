package academy.devdojo.aulas.associacao.teste;

import academy.devdojo.aulas.associacao.dominio.Jogador;
import academy.devdojo.aulas.associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fallen");
        Jogador jogador2 = new Jogador("Art");
        Jogador jogador3 = new Jogador("KScerato");
        Jogador jogador4 = new Jogador("Yuurih");
        Jogador jogador5 = new Jogador("Chelo");
        Time time1 = new Time("Fúria");
        Jogador[] jogadores = new Jogador[5];

        jogador1.setTime(time1);
        jogadores[0] = jogador1;
        jogador2.setTime(time1);
        jogadores[1] = jogador2;
        jogador3.setTime(time1);
        jogadores[2] = jogador3;
        jogador4.setTime(time1);
        jogadores[3] = jogador4;
        jogador5.setTime(time1);
        jogadores[4] = jogador5;
        time1.setJogadores(jogadores);

        System.out.println("----Jogador1----");
        jogador1.imprime();
        System.out.println("----Jogador2----");
        jogador2.imprime();
        System.out.println("----Jogador3----");
        jogador3.imprime();
        System.out.println("----Jogador4----");
        jogador4.imprime();
        System.out.println("----Jogador5----");
        jogador5.imprime();
        System.out.println("----Time----");
        time1.imprime();
    }
}
