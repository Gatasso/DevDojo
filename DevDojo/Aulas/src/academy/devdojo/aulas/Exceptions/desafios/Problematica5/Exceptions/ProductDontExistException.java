package academy.devdojo.aulas.Exceptions.desafios.Problematica5.Exceptions;

public class ProductDontExistException extends Exception{
    public ProductDontExistException() {
        super("This product dont exists");
    }
}
