import java.lang.reflect.Modifier;

class PoligonoConcreto extends Poligono {
    public PoligonoConcreto(int lados) {
        super("Polígono", lados); // Chama o construtor da classe base (Poligono)
    }

    @Override
    public double area() {
        // Implementação genérica para polígonos regulares
        return 0; // Exemplo: área não implementada
    }

    @Override
    public double perimetro() {
        // Implementação genérica para polígonos regulares
        return 0; // Exemplo: perímetro não implementado
    }

    @Override
    public String[] info() {
        // Retorna informações sobre o polígono
        return new String[] {
            "Lados: " + getLados()
        };
    }
}

public class TestePoligono extends Teste {
    public boolean a_classe_poligono_deveria_ser_abstrata() {
        return Modifier.isAbstract(Poligono.class.getModifiers());
    }

    public boolean um_poligono_deveria_ser_uma_instancia_de_figura() {
        Poligono p = new PoligonoConcreto(3);
        return p instanceof Figura;
    }

    public boolean um_poligono_deveria_ter_tipo_correto() {
        Poligono p = new PoligonoConcreto(3);
        return p.getTipo().equals("Polígono");
    }

    public boolean um_poligono_deveria_ter_lados_corretos() {
        Poligono p = new PoligonoConcreto(4);
        return p.getLados() == 4;
    }

    public boolean um_poligono_deveria_retornar_as_informacoes_corretamente() {
        Poligono p = new PoligonoConcreto(6);
        String[] info = p.info();
        return info[0].equals("Lados: 6");
    }

    public boolean um_poligono_nao_deveria_poder_ter_menos_de_3_lados() {
        try {
            new PoligonoConcreto(2); // Cria um polígono com 2 lados (inválido)
            return false; // Se não lançar exceção, o teste falha
        } catch (IllegalArgumentException e) {
            return true; // Se lançar exceção, o teste passa
        }
    }
}