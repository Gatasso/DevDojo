package academy.devdojo.aulas.Exceptions.desafios.Problematica3.Exceptions;

public class NotBudgetEnoughException extends Exception{
    public NotBudgetEnoughException() {
        super("You dont have budget enough to complete the transaction");
    }

    public NotBudgetEnoughException(String message) {
        super(message);
    }
}
