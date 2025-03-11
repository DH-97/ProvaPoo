import java.lang.reflect.Modifier;

class FiguraConcreta extends Figura {
    public FiguraConcreta(String tipo) {
        super(tipo);
    }

    @Override
    public String[] info() {
        return new String[] {"Teste"};
    }
    
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}

public class TesteFigura extends Teste {
    public boolean a_classe_figura_deveria_ser_abstrata() {
        return Modifier.isAbstract(Figura.class.getModifiers());
    }

    public boolean uma_figura_deveria_ter_tipo_correto() {
        Figura f = new FiguraConcreta("Teste");
        return f.getTipo().equals("Teste");
    }

    public boolean uma_figura_deveria_retornar_as_informacoes_corretamente() {
        Figura f = new FiguraConcreta("Teste");
        String[] info = f.info();
        return info[0].equals("Teste");
    }

    public boolean uma_figura_nao_deveria_poder_ser_escalada_com_fator_negativo() {
        try {
            Figura f = new FiguraConcreta("Teste");
            f.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_figura_nao_deveria_poder_ser_escalada_com_fator_zero() {
        try {
            Figura f = new FiguraConcreta("Teste");
            f.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_figura_nao_deveria_poder_ter_tipo_nulo() {
        try {
            Figura f = new FiguraConcreta(null);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_figura_nao_deveria_poder_ter_tipo_vazio() {
        try {
            Figura f = new FiguraConcreta("");
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
