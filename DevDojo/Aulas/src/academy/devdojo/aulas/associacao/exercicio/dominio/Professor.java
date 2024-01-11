package academy.devdojo.aulas.associacao.exercicio.dominio;

public class Professor {
    private String nome, especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("--------------------------------------");
        if (this.seminarios == null) return;
        System.out.println("Seminário:");
        for (Seminario seminario : this.seminarios) {
            System.out.println("Título:" + seminario.getTitulo());
            System.out.println("Local:" + seminario.getLocal().getEndereco());
            System.out.println("--------------------------------------");
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("Alunos cadastrados:");
            for (Aluno alunos : seminario.getAlunos()) {
                System.out.println("Nome: " + alunos.getNome());
                System.out.println("Idade: " + alunos.getIdade());
            }
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }


    }
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
