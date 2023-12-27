package academy.devdojo.aulas.associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;  //referencia para o time

    public Jogador(String nome) {  //time no construtor é caso o jogador precise de um time para se cadastrar
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if(time!=null){
            System.out.println(time.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
