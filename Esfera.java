public class Esfera extends Figura3D {
    private double raio;

    // Construtor
    public Esfera(double raio) {
        super("Esfera"); // Chama o construtor da classe base (Figura3D)
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        this.raio = raio;
    }

    // Método getter
    public double getRaio() {
        return raio;
    }

    // Método setter
    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        this.raio = raio;
    }

    // Implementação do método abstrato para calcular o volume
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3); // Volume = (4/3) * π * r^3
    }

    // Implementação do método abstrato para calcular a área
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(raio, 2); // Área = 4 * π * r^2
    }

    // Implementação do método abstrato para calcular o perímetro
    @Override
    public double perimetro() {
        // Uma esfera não tem um perímetro bem definido, então retornamos 0
        return 0;
    }

    // Implementação do método abstrato para retornar informações
    @Override
    public String[] info() {
        return new String[] {
            "Raio: " + raio
        };
    }

    // Implementação do método abstrato para escalar a esfera
    @Override
    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("Fator de escala deve ser positivo.");
        }
        raio *= fator;
    }
}