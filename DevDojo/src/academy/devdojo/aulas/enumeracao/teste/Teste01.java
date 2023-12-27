package academy.devdojo.aulas.enumeracao.teste;

import academy.devdojo.aulas.enumeracao.dominio.Cliente;

import academy.devdojo.aulas.enumeracao.dominio.TipoCliente;
import academy.devdojo.aulas.enumeracao.dominio.TipoPagamento;


public class Teste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Eumemo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Outrapessoa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
//        Cliente cliente3 = new Cliente("Outrapessoa",TipoCliente.PESSOA_JURIDICA);
//        Cliente cliente4 = new Cliente("Outrapessoa",TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
//        System.out.println(cliente3);
//        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(1000));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(1000));
//        TipoCliente tipoCliente = TipoCliente.valueOf("Pessoa Física");
//        System.out.println(tipoCliente);  //exceção
//        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
//        System.out.println(tipoCliente.getNomeRelatorio());  //retorna valores de um enum

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física2");
        System.out.println(tipoCliente2);

    }
}
