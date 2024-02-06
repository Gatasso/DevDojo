package academy.devdojo.aulas.Exceptions.desafios.Problematica4;

public class UnavailableSeatException extends Exception{
    public UnavailableSeatException() {
        super("This seat is already occupied");
    }

    public UnavailableSeatException(String message) {
        super(message);
    }
}
