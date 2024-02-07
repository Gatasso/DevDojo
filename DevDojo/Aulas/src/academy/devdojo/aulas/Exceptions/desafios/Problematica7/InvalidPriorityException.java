package academy.devdojo.aulas.Exceptions.desafios.Problematica7;

public class InvalidPriorityException extends Exception{
    public InvalidPriorityException() {
        super("This level of priority dont exist");
    }
}
