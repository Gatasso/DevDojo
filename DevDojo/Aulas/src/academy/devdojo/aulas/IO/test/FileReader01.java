package academy.devdojo.aulas.IO.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
    public static void main(String[] args) {
        File file = new File("fileTest.txt");
        try (FileReader fr = new FileReader(file)){
            System.out.println(fr.read());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
