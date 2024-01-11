package academy.devdojo.exercicios.gungames.domain;

public class Gun implements GunActions{
    private GunType type;


    @Override
    public void shoot() {

    }

    @Override
    public boolean aim() {
        return false;
    }

    @Override
    public void reload() {

    }
}
