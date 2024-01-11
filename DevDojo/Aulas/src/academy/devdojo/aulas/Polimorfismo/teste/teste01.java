package academy.devdojo.aulas.Polimorfismo.teste;

import academy.devdojo.aulas.Polimorfismo.dominio.Computador;
import academy.devdojo.aulas.Polimorfismo.dominio.Produto;
import academy.devdojo.aulas.Polimorfismo.dominio.Televisão;
import academy.devdojo.aulas.Polimorfismo.dominio.Tomate;
import academy.devdojo.aulas.Polimorfismo.servico.CalculadoraImposto;

public class teste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomatola DevDojo", 10);
        Televisão TV = new Televisão("Samsung 50\"",5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        CalculadoraImposto.calcularImposto(TV);

    }
}
