package academy.devdojo.aulas.heranca.teste;

import academy.devdojo.aulas.heranca.dominio.Endereco;
import academy.devdojo.aulas.heranca.dominio.Funcionario;
import academy.devdojo.aulas.heranca.dominio.Pessoa;

public class Teste01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 3");
        endereco1.setCep("40028922");
        Pessoa pessoa1 = new Pessoa("Shikamaru","02030405");
        pessoa1.setEndereco(endereco1);

        System.out.println("Pessoa:");
        pessoa1.imprime();

        Funcionario funcionario = new Funcionario("Josevaldo","05080203");
        funcionario.setEndereco(endereco1);
        funcionario.setSalario(5000);

        System.out.println("Funcionario:");
        funcionario.imprime();
    }
}
