public class Cilindro extends Figura3D {
    private double raio;
    private double altura;

    // Construtor
    public Cilindro(double raio, double altura) {
        super("Cilindro"); // Chama o construtor da classe base (Figura3D)
        if (raio <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Raio e altura devem ser positivos.");
        }
        this.raio = raio;
        this.altura = altura;
    }

    // Métodos getters
    public double getRaio() {
        return raio;
    }

    public double getAltura() {
        return altura;
    }

    // Métodos setters
    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        this.raio = raio;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva.");
        }
        this.altura = altura;
    }

    // Implementação do método abstrato para calcular o volume
    @Override
    public double volume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    // Implementação do método abstrato para calcular a área
    @Override
    public double area() {
        return 2 * Math.PI * raio * raio + 2 * Math.PI * raio * altura;
    }

    // Implementação do método abstrato para calcular o perímetro
    @Override
    public double perimetro() {
        // Cilindro não tem um perímetro bem definido, então retornamos 0
        return 0;
    }

    // Implementação do método abstrato para retornar informações
    @Override
    public String[] info() {
        return new String[] {
            "Raio: " + raio,
            "Altura: " + altura
        };
    }

    // Implementação do método abstrato para escalar o cilindro
    @Override
    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("Fator de escala deve ser positivo.");
        }
        raio *= fator;
        altura *= fator;
    }
}