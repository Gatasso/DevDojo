package academy.devdojo.aulas.Exceptions.desafios.Problematica2;

public class UnderAgeException extends Exception{
    public UnderAgeException() {
        super("You must have 13 years old to play this game");
    }
}
