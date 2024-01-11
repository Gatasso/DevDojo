package academy.devdojo.aulas.associacao.teste;

import academy.devdojo.aulas.associacao.dominio.Escola;
import academy.devdojo.aulas.associacao.dominio.Professor;

public class EscolaTeste02 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Matheus", "Sexologia");
        Professor professor02 = new Professor("Nicolau", "Negacionismo");
        Professor professor03 = new Professor("Dudinha", "Cubos Mágicos");

        Professor[] professores = new Professor[]{professor01,professor02,professor03};
        Escola escola = new Escola("Escolinha",professores);

        professor01.setEscola(escola);
        professor02.setEscola(escola);
        professor03.setEscola(escola);

        for (Professor professor : professores) {
            professor.imprime();
        }
        escola.imprime();



    }
}
