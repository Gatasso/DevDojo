package academy.devdojo.exercicios.jogocartas.domain;

public enum TypeSuits {
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    SPADES("Spades");

    private String name;

    TypeSuits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
