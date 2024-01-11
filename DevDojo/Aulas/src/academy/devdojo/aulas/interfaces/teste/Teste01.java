package academy.devdojo.aulas.interfaces.teste;

import academy.devdojo.aulas.interfaces.dominio.DataBaseLoader;
import academy.devdojo.aulas.interfaces.dominio.FileLoader;

public class Teste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.checkPermission();
        dataBaseLoader.remove();
        fileLoader.load();
        fileLoader.checkPermission();
        fileLoader.remove();
    }
}
