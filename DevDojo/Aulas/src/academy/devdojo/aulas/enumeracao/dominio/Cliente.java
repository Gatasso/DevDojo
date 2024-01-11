package academy.devdojo.aulas.enumeracao.dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;
   /* public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";*/
    private TipoPagamento tipoPagamento;


    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoCliente=" + tipoCliente.CODIGO +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
