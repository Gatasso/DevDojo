package academy.devdojo.aulas.Exceptions.test.test;

import academy.devdojo.aulas.Exceptions.test.domain.Leitor1;
import academy.devdojo.aulas.Exceptions.test.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFileRight();
    }
    public static void readFileRight(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2= new Leitor2()){

        }catch (IOException e){

        }
    }

    public static void readFileWrong(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
