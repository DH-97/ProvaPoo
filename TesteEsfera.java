import java.lang.reflect.Modifier;

public  class TesteEsfera extends Teste {
    public boolean a_classe_esfera_nao_deveria_ser_abstrata() {
        return !Modifier.isAbstract(Esfera.class.getModifiers());
    }
    
    public boolean uma_esfera_deveria_ser_uma_instancia_de_figura_3d() {
        Esfera e = new Esfera(1);
        return e instanceof Figura3D;
    }

    public boolean uma_esfera_deveria_ter_tipo_correto() {
        Esfera e = new Esfera(1);
        return e.getTipo().equals("Esfera");
    }

    public boolean uma_esfera_deveria_ter_raio_correto() {
        Esfera e = new Esfera(2);
        return e.getRaio() == 2;
    }

    public boolean uma_esfera_deveria_retornar_as_informacoes_corretamente() {
        Esfera e = new Esfera(3);
        String[] info = e.info();
        return info[0].equals("Raio: 3.0");
    }

    public boolean uma_esfera_deveria_ter_volume_correto() {
        Esfera e = new Esfera(4);
        return e.volume() == 4.0 / 3.0 * Math.PI * 64;
    }

    public boolean uma_esfera_deveria_ter_area_correta() {
        Esfera e = new Esfera(5);
        return e.area() == 4 * Math.PI * 25;
    }

    public boolean uma_esfera_deveria_poder_ser_escalada() {
        Esfera e = new Esfera(6);
        e.escalar(2);
        return e.getRaio() == 12;
    }

    public boolean uma_esfera_nao_deveria_poder_ser_escalada_com_fator_negativo() {
        try {
            Esfera e = new Esfera(7);
            e.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_esfera_nao_deveria_ser_escalada_com_fator_zero() {
        try {
            Esfera e = new Esfera(8);
            e.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_esfera_nao_deveria_ter_raio_negativo() {
        try {
            Esfera e = new Esfera(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_esfera_nao_deveria_ter_raio_zero() {
        try {
            Esfera e = new Esfera(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_esfera_nao_deveria_ter_raio_negativo_ao_ser_modificado() {
        try {
            Esfera e = new Esfera(1);
            e.setRaio(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
