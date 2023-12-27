package academy.devdojo.aulas.heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático Funcionrio");
    }
    {
        System.out.println("Dentro do bloco de inicialização Funcionrio 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização Funcionrio 2");
    }
    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        System.out.println("Dentro do construtor Funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
