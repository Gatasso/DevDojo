package academy.devdojo.aulas.modificadorfinal.teste;

import academy.devdojo.aulas.modificadorfinal.dominio.Carro;
import academy.devdojo.aulas.modificadorfinal.dominio.Comprador;

public class Teste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Comprador comprador = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Larry");
        System.out.println(carro.COMPRADOR);
    }
}
