package academy.devdojo.aulas.heranca.dominio;

public class Pessoa {
    private String nome,cpf;
    private Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicialização estático Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização Pessoa 2");
    }

    public Pessoa(String nome,String cpf) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " "+ this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
