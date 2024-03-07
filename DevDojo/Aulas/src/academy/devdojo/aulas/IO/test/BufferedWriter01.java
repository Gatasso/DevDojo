package academy.devdojo.aulas.IO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)){ //try with resources pois FileWriter é closeable
            BufferedWriter bffWr = new BufferedWriter(fw);
            bffWr.write("Matheus Galasso Romera esteve aqui"); // escrevendo dentro do arquivo
            bffWr.newLine();
            bffWr.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
