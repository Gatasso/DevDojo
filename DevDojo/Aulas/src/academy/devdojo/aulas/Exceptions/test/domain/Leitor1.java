package academy.devdojo.aulas.Exceptions.test.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 1");
    }
}
