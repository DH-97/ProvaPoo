public class Retangulo extends Poligono {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super("Retângulo", 4);
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser positivas.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base deve ser positiva.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva.");
        }
        this.altura = altura;
    }

    @Override
    public String[] info() {
        return new String[] {"Lados: 4", "Base: " + base, "Altura: " + altura};
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void escalar(double fator) {
        super.escalar(fator);
        base *= fator;
        altura *= fator;
    }
}