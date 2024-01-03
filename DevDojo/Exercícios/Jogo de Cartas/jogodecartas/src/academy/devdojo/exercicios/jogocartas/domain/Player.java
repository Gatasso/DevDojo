package academy.devdojo.exercicios.jogocartas.domain;

public class Player {
    private String name;
    private Card [] hand;

    public Player(String name) {
        this.name = name;
    }

    public void receive(){

    }

    public String getName() {
        return name;
    }
}

