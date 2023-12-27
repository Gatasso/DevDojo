package academy.devdojo.aulas.associacao.teste;

import academy.devdojo.aulas.associacao.dominio.Escola;
import academy.devdojo.aulas.associacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Zé do Fumo");
        Professor professor2 = new Professor("Jiraya");
        Professor[] professores = {professor1};
        Escola escolinha = new Escola("Escolinha da Fumaça",professores);

        escolinha.imprime();

    }
}
