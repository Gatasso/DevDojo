package academy.devdojo.aulas.Polimorfismo.dominio;

public class Televisão extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisão(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
