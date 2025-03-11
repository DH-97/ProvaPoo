import java.lang.reflect.Modifier;

class Figura3DConcreta extends Figura3D {
    public Figura3DConcreta(String tipo) {
        super(tipo);
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public void escalar(double fator) {
        super.escalar(fator);
    }

    @Override
    public String[] info() {
        return new String[] {"Info"};
    }
}

public class TesteFigura3D extends Teste {
    public boolean a_classe_figura_3d_deveria_ser_abstrata() {
        return Modifier.isAbstract(Figura3D.class.getModifiers());
    }

    public boolean uma_figura_3d_deveria_ter_tipo_correto() {
        Figura3D f = new Figura3DConcreta("Teste");
        return f.getTipo().equals("Teste");
    }

    public boolean uma_figura_3d_deveria_retornar_as_informacoes_corretamente() {
        Figura3D f = new Figura3DConcreta("Teste") ;
        String[] info = f.info();
        return info[0].equals("Info");
    }

    public boolean uma_figura_3d_nao_deveria_poder_ser_escalada_com_fator_negativo() {
        try {
            Figura3D f = new Figura3DConcreta("Teste");
            f.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_figura_3d_nao_deveria_poder_ser_escalada_com_fator_zero() {
        try {
            Figura3D f = new Figura3DConcreta("Teste");
            f.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_figura_3d_nao_deveria_poder_ter_tipo_nulo() {
        try {
            Figura3D f = new Figura3DConcreta(null);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_figura_3d_deveria_ter_area_correta() {
        Figura3D f = new Figura3DConcreta("Teste");
        return f.area() == 0;
    }

    public boolean uma_figura_3d_deveria_ter_volume_correto() {
        Figura3D f = new Figura3DConcreta("Teste");
        return f.volume() == 0;
    }
}
