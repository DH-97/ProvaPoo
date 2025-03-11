import java.lang.reflect.Modifier;

public class TesteCirculo extends Teste {
    public boolean a_classe_circle_nao_deveria_ser_abstrata() {
        return !Modifier.isAbstract(Circulo.class.getModifiers());
    }

    public boolean um_circulo_deveria_ser_uma_instancia_de_figura() {
        Circulo c = new Circulo(1);
        return c instanceof Figura;
    }

    public boolean um_circulo_deveria_ter_tipo_correto() {
        Circulo c = new Circulo(1);
        return c.getTipo().equals("Círculo");
    }

    public boolean um_circulo_deveria_ter_raio_correto() {
        Circulo c = new Circulo(2);
        return c.getRaio() == 2;
    }

    public boolean um_circulo_deveria_retornar_as_informacoes_corretamente() {
        Circulo c = new Circulo(3);
        String[] info = c.info();
        return info[0].equals("Raio: 3.0");
    }

    public boolean um_circulo_deveria_ter_area_correta() {
        Circulo c = new Circulo(4);
        return c.area() == Math.PI * 16;
    }

    public boolean um_circulo_deveria_ter_perimetro_correto() {
        Circulo c = new Circulo(5);
        return c.perimetro() == 2 * Math.PI * 5;
    }

    public boolean um_circulo_deveria_poder_ser_escalado() {
        Circulo c = new Circulo(6);
        c.escalar(2);
        return c.getRaio() == 12;
    }

    public boolean um_circulo_nao_deveria_poder_ser_escalado_com_fator_negativo() {
        try {
            Circulo c = new Circulo(7);
            c.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_circulo_nao_deveria_ser_escalado_com_fator_zero() {
        try {
            Circulo c = new Circulo(8);
            c.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_circulo_nao_deveria_ter_raio_negativo() {
        try {
            Circulo c = new Circulo(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_circulo_nao_deveria_ter_raio_zero() {
        try {
            Circulo c = new Circulo(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_circulo_nao_deveria_ter_raio_negativo_ao_ser_modificado() {
        try {
            Circulo c = new Circulo(1);
            c.setRaio(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_circulo_nao_deveria_ter_raio_zero_ao_ser_modificado() {
        try {
            Circulo c = new Circulo(1);
            c.setRaio(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
