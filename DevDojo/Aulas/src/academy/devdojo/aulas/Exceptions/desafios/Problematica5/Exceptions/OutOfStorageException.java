package academy.devdojo.aulas.Exceptions.desafios.Problematica5.Exceptions;

public class OutOfStorageException extends Exception{
    public OutOfStorageException() {
        super("This product is not available on this Quantity");
    }
}
