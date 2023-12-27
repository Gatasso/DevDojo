package academy.devdojo.aulas.Polimorfismo.teste;

import academy.devdojo.aulas.Polimorfismo.repositorio.Repositorio;
import academy.devdojo.aulas.Polimorfismo.servico.RepositorioArquivos;
import academy.devdojo.aulas.Polimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.aulas.Polimorfismo.servico.RepositorioMemoria;

public class TesteRepositorio01 {
    public static void main(String[] args) {
        Repositorio repositorio0 = new RepositorioMemoria();
        Repositorio repositorio1 = new RepositorioArquivos();
        Repositorio repositorio2 = new RepositorioBancoDeDados();
        repositorio0.save();
        repositorio1.save();
        repositorio2.save();
    }
}
