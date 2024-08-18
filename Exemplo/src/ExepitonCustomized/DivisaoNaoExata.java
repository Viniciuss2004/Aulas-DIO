package ExepitonCustomized;

public class DivisaoNaoExata extends Exception {

    private int numerado;
    private int denominador;

    public DivisaoNaoExata(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "DivisaoNaoExata{" +
                "numerado=" + numerado +
                ", denominador=" + denominador +
                '}';
    }
}
