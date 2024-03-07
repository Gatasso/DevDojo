package academy.devdojo.aulas.IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)){ //try with resources pois FileWriter é closeable
            fw.write("Matheus Galasso Romera esteve aqui"); // escrevendo dentro do arquivo
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
