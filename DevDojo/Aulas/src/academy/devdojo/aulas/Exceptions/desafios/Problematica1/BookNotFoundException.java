package academy.devdojo.aulas.Exceptions.desafios.Problematica1;

public class BookNotFoundException extends Exception {
    public BookNotFoundException() {
        super("Livro não cadastrado na biblioteca");
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}
