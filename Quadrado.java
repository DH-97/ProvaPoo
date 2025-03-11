public class Quadrado extends Retangulo {

    // Construtor
    public Quadrado(double lado) {
        super(lado, lado); // Chama o construtor da classe base (Retangulo) com base e altura iguais
    }

    // Método getter para o lado
    public double getLado() {
        return getBase(); // Como é um quadrado, base e altura são iguais
    }

    // Método setter para o lado
    public void setLado(double lado) {
        setBase(lado); // Define a base
        setAltura(lado); // Define a altura
    }

    // Sobrescreve o método getTipo para retornar "Quadrado"
    @Override
    public String getTipo() {
        return "Quadrado";
    }

    // Sobrescreve o método info para retornar informações específicas do quadrado
    @Override
    public String[] info() {
        return new String[] {
            "Lados: 4",
            "Lado: " + getLado()
        };
    }
}