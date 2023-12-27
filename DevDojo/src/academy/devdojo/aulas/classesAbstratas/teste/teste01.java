package academy.devdojo.aulas.classesAbstratas.teste;

import academy.devdojo.aulas.classesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.aulas.classesAbstratas.dominio.Gerente;

public class teste01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Zoro",1000);
        Gerente gerente = new Gerente("Nami",5000);
        Desenvolvedor dev = new Desenvolvedor("Sanji", 10000);
        //System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(dev);
        gerente.imprime();
        dev.imprime();
    }
}
