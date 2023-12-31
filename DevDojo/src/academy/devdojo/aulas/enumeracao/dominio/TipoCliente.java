package academy.devdojo.aulas.enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int CODIGO;
    private String nomeRelatorio;
    TipoCliente(int valor,String nomeRelatorio) {
        this.CODIGO = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getCODIGO() {
        return CODIGO;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
