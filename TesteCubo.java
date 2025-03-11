import java.lang.reflect.Modifier;

public class TesteCubo extends Teste {
    public boolean a_classe_cubo_deveria_ser_concreta() {
        return !Modifier.isAbstract(Cubo.class.getModifiers());
    }

    public boolean um_cubo_deveria_ser_uma_instancia_de_figura_3d() {
        Cubo c = new Cubo(1);
        return c instanceof Figura3D;
    }

    public boolean um_cubo_deveria_ter_tipo_correto() {
        Cubo c = new Cubo(1);
        return c.getTipo().equals("Cubo");
    }

    public boolean um_cubo_deveria_ter_lado_correto() {
        Cubo c = new Cubo(2);
        return c.getAresta() == 2;
    }

    public boolean um_cubo_deveria_retornar_as_informacoes_corretamente() {
        Cubo c = new Cubo(3);
        String[] info = c.info();
        return info[0].equals("Lado: 3.0");
    }

    public boolean um_cubo_deveria_ter_volume_correto() {
        Cubo c = new Cubo(4);
        return c.volume() == 64;
    }

    public boolean um_cubo_deveria_ter_area_correta() {
        Cubo c = new Cubo(5);
        return c.area() == 150;
    }

    public boolean um_cubo_deveria_poder_ser_escalado() {
        Cubo c = new Cubo(6);
        c.escalar(2);
        return c.getAresta() == 12;
    }

    public boolean um_cubo_nao_deveria_poder_ser_escalado_com_fator_negativo() {
        try {
            Cubo c = new Cubo(7);
            c.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cubo_nao_deveria_ser_escalado_com_fator_zero() {
        try {
            Cubo c = new Cubo(8);
            c.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cubo_nao_deveria_ter_lado_negativo() {
        try {
            Cubo c = new Cubo(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cubo_nao_deveria_ter_lado_zero() {
        try {
            Cubo c = new Cubo(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cubo_nao_deveria_ter_lado_negativo_ao_ser_modificado() {
        try {
            Cubo c = new Cubo(1);
            c.setAresta(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cubo_nao_deveria_ter_lado_zero_ao_ser_modificado() {
        try {
            Cubo c = new Cubo(2);
            c.setAresta(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
