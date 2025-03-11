public abstract class Figura {
    private String tipo;

    public Figura(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo não pode ser nulo ou vazio.");
        }
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract String[] info();
    public abstract double area();
    public abstract double perimetro();

    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("Fator de escala deve ser positivo.");
        }
    }
}