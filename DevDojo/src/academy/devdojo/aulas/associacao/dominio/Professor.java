package academy.devdojo.aulas.associacao.dominio;

public class Professor {
    private String nome, materia;
    private Escola escola;


    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public void imprime(){
        System.out.println("--------------------");
        System.out.println(this.nome);
        System.out.println(this.materia);
        //escola.imprime();
        System.out.println("--------------------");
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
