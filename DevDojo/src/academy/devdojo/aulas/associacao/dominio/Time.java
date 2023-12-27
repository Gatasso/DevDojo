package academy.devdojo.aulas.associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;  //referencia para jogador

    public Time(String nome) {  //construtor para associacao unidirecional
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) { //construtor para associação bidirecional
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
