public abstract class Poligono extends Figura {
    private int lados;

    public Poligono(String tipo, int lados) {
        super(tipo);
        if (lados < 3) {
            throw new IllegalArgumentException("Polígono deve ter pelo menos 3 lados.");
        }
        this.lados = lados;
    }

    public int getLados() {
        return lados;
    }
}