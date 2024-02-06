package academy.devdojo.aulas.Exceptions.desafios.Problematica5;

public class ProductDontExistException extends Exception{
    public ProductDontExistException() {
        super("This product dont exists");
    }
}
