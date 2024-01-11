package academy.devdojo.aulas.Polimorfismo.servico;

import academy.devdojo.aulas.Polimorfismo.dominio.Computador;
import academy.devdojo.aulas.Polimorfismo.dominio.Produto;
import academy.devdojo.aulas.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    /*public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Valor do computador: " + computador.getValor());
        System.out.println("Imposto a ser pago:" + imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do tomate: " + tomate.getValor());
        System.out.println("Imposto a ser pago:" + imposto);
    }*/

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto:" + produto.getNome());
        System.out.println("Valor do Produto " + produto.getValor());
        System.out.println("Imposto a ser pago:" + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }
}
