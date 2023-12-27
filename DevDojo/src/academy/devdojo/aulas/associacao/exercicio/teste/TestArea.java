package academy.devdojo.aulas.associacao.exercicio.teste;

import academy.devdojo.aulas.associacao.exercicio.dominio.Aluno;
import academy.devdojo.aulas.associacao.exercicio.dominio.Local;
import academy.devdojo.aulas.associacao.exercicio.dominio.Professor;
import academy.devdojo.aulas.associacao.exercicio.dominio.Seminario;

public class TestArea {
    public static void main(String[] args) {
        Local local01 = new Local("Sala 1");
        Local local02 = new Local("Sala 10");
        Aluno aluno01 = new Aluno("Alpha", 18);
        Aluno aluno02 = new Aluno("Brave", 19);
        Aluno aluno03 = new Aluno("Charlie", 20);
        Aluno aluno04 = new Aluno("Delta", 21);
        Aluno aluno05 = new Aluno("Echo", 22);
        Aluno aluno06 = new Aluno("Foxtrot", 22);
        Aluno aluno07 = new Aluno("Golf", 23);
        Aluno aluno08 = new Aluno("Hotel", 24);
        Aluno[] alunosSeminario1 = {aluno01, aluno03, aluno05, aluno07};
        Aluno[] alunosSeminario2 = {aluno02, aluno04, aluno06, aluno08};
        Professor professor01 = new Professor("Mike", "Logica de Programação");
        Professor professor02 = new Professor("Lima", "Estrutura de Dados");
        Seminario seminario01 = new Seminario("DataBase", local01, alunosSeminario1);
        Seminario seminario02 = new Seminario("Algoritmos", local02, alunosSeminario2);
        Seminario[] seminarios = {seminario01, seminario02};
        professor01.setSeminarios(seminarios);
        professor02.setSeminarios(seminarios);

        professor01.imprime();
        professor02.imprime();


    }
}
