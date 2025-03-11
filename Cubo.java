public class Cubo extends Figura3D {
    private double aresta;

    // Construtor
    public Cubo(double aresta) {
        super("Cubo"); // Chama o construtor da classe base (Figura3D)
        if (aresta <= 0) {
            throw new IllegalArgumentException("Aresta deve ser positiva.");
        }
        this.aresta = aresta;
    }

    // Método getter
    public double getAresta() {
        return aresta;
    }

    // Método setter
    public void setAresta(double aresta) {
        if (aresta <= 0) {
            throw new IllegalArgumentException("Aresta deve ser positiva.");
        }
        this.aresta = aresta;
    }

    // Implementação do método abstrato para calcular o volume
    @Override
    public double volume() {
        return Math.pow(aresta, 3); // Volume = aresta^3
    }

    // Implementação do método abstrato para calcular a área
    @Override
    public double area() {
        return 6 * Math.pow(aresta, 2); // Área = 6 * aresta^2
    }

    // Implementação do método abstrato para calcular o perímetro
    @Override
    public double perimetro() {
        // Um cubo não tem um perímetro bem definido, então retornamos 0
        return 0;
    }

    // Implementação do método abstrato para retornar informações
    @Override
    public String[] info() {
        return new String[] {
            "Lado: " + aresta
        };
    }

    // Implementação do método abstrato para escalar o cubo
    @Override
    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("Fator de escala deve ser positivo.");
        }
        aresta *= fator;
    }
}