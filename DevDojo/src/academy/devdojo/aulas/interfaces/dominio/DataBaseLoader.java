package academy.devdojo.aulas.interfaces.dominio;

public class DataBaseLoader implements DataLoader,DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando DB");
    }

    @Override
    public void remove() {
        System.out.println("Removendo DB");
    }


}
