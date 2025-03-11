public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        this.raio = raio;
    }

    @Override
    public String[] info() {
        return new String[] {"Raio: " + raio};
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void escalar(double fator) {
        super.escalar(fator);
        raio *= fator;
    }
}