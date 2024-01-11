package academy.devdojo.aulas.interfaces.dominio;

public class FileLoader implements DataLoader,DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando File");
    }

    @Override
    public void remove() {
        System.out.println("Removendo File");
    }
}
