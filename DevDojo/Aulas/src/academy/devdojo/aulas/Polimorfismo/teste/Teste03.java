package academy.devdojo.aulas.Polimorfismo.teste;

import academy.devdojo.aulas.Polimorfismo.dominio.Computador;
import academy.devdojo.aulas.Polimorfismo.dominio.Produto;
import academy.devdojo.aulas.Polimorfismo.dominio.Tomate;
import academy.devdojo.aulas.Polimorfismo.servico.CalculadoraImposto;

public class Teste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("AMD Ryzen 5 3600", 1500);

        System.out.println("/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*");

        Tomate tomate = new Tomate("DEVDOJO TOMATAO", 15);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
