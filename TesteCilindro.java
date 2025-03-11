public class TesteCilindro extends Teste {
    public boolean a_classe_cilindro_deveria_ser_subclasse_de_figura() {
        return Figura.class.isAssignableFrom(Cilindro.class);
    }

    public boolean um_cilindro_deveria_ter_tipo_correto() {
        Cilindro c = new Cilindro(1, 2);
        return c.getTipo().equals("Cilindro");
    }

    public boolean um_cilindro_deveria_ter_raio_correto() {
        Cilindro c = new Cilindro(2, 3);
        return c.getRaio() == 2;
    }

    public boolean um_cilindro_deveria_ter_altura_correta() {
        Cilindro c = new Cilindro(3, 4);
        return c.getAltura() == 4;
    }

    public boolean um_cilindro_deveria_retornar_as_informacoes_corretamente() {
        Cilindro c = new Cilindro(4, 5);
        String[] info = c.info();
        return info[0].equals("Raio: 4.0") && info[1].equals("Altura: 5.0");
    }

    public boolean um_cilindro_deveria_ter_volume_correto() {
        Cilindro c = new Cilindro(5, 6);
        return c.volume() == Math.PI * 25 * 6;
    }

    public boolean um_cilindro_deveria_ter_area_correta() {
        Cilindro c = new Cilindro(5, 6);
        double areaEsperada = 2 * Math.PI * 25 + 2 * Math.PI * 30; // 110π
        double areaCalculada = c.area();
        double tolerancia = 0.0001; // Tolerância para comparação
        return Math.abs(areaEsperada - areaCalculada) < tolerancia;
    }

    public boolean um_cilindro_deveria_poder_ser_escalado() {
        Cilindro c = new Cilindro(7, 8);
        c.escalar(2);
        return c.getRaio() == 14 && c.getAltura() == 16;
    }

    public boolean um_cilindro_nao_deveria_poder_ser_escalado_com_fator_negativo() {
        try {
            Cilindro c = new Cilindro(8, 9);
            c.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ser_escalado_com_fator_zero() {
        try {
            Cilindro c = new Cilindro(9, 10);
            c.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ter_raio_negativo() {
        try {
            Cilindro c = new Cilindro(-1, 11);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ter_altura_negativa() {
        try {
            Cilindro c = new Cilindro(12, -1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ter_raio_zero() {
        try {
            Cilindro c = new Cilindro(0, 13);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ter_altura_zero() {
        try {
            Cilindro c = new Cilindro(14, 0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ter_raio_negativo_ao_ser_modificado() {
        try {
            Cilindro c = new Cilindro(1, 15);
            c.setRaio(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ter_altura_negativa_ao_ser_modificada() {
        try {
            Cilindro c = new Cilindro(16, 1);
            c.setAltura(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ter_raio_zero_ao_ser_modificado() {
        try {
            Cilindro c = new Cilindro(1, 17);
            c.setRaio(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_cilindro_nao_deveria_ter_altura_zero_ao_ser_modificada() {
        try {
            Cilindro c = new Cilindro(18, 1);
            c.setAltura(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
