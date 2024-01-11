package academy.devdojo.aulas.Polimorfismo.teste;

import academy.devdojo.aulas.Polimorfismo.dominio.Computador;
import academy.devdojo.aulas.Polimorfismo.dominio.Produto;
import academy.devdojo.aulas.Polimorfismo.dominio.Tomate;

public class Teste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("AMD Ryzen 5 3600", 1500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*");
        Produto produto2 = new Tomate("DEVDOJO TOMATAO", 15);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
