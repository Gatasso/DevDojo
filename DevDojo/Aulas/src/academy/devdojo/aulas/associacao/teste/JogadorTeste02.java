package academy.devdojo.aulas.associacao.teste;

import academy.devdojo.aulas.associacao.dominio.Jogador;
import academy.devdojo.aulas.associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fallen");
        Time time1 = new Time("Furia");

        jogador1.setTime(time1);
        jogador1.imprime();

    }
}
