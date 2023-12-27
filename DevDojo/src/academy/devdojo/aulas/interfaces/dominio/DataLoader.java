package academy.devdojo.aulas.interfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Checando permissão");
    }
}
