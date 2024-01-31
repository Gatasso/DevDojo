package academy.devdojo.aulas.Exceptions.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }
    private static void createNewFile(){
        File file = new File("Arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado"+ isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
