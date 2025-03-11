public class TesteQuadrado extends Teste {
    public boolean a_classe_quadrado_deveria_estender_retangulo() {
        return Retangulo.class.isAssignableFrom(Quadrado.class);
    }

    public boolean um_quadrado_deveria_ser_uma_instancia_de_figura() {
        Quadrado q = new Quadrado(1);
        return q instanceof Figura;
    }

    public boolean um_quadrado_deveria_ser_uma_instancia_de_poligono() {
        Quadrado q = new Quadrado(1);
        return q instanceof Poligono;
    }

    public boolean um_quadrado_deveria_ter_tipo_correto() {
        Quadrado q = new Quadrado(1);
        return q.getTipo().equals("Quadrado");
    }

    public boolean um_quadrado_deveria_ter_o_numero_de_lados_correto() {
        Quadrado q = new Quadrado(1);
        return q.getLados() == 4;
    }

    public boolean um_quadrado_deveria_ter_lado_correto() {
        Quadrado q = new Quadrado(2);
        return q.getLado() == 2;
    }

    public boolean um_quadrado_deveria_retornar_as_informacoes_corretamente() {
        Quadrado q = new Quadrado(3);
        String[] info = q.info();
        return info[0].equals("Lados: 4") && info[1].equals("Lado: 3.0");
    }

    public boolean um_quadrado_deveria_ter_area_correta() {
        Quadrado q = new Quadrado(4);
        return q.area() == 16;
    }

    public boolean um_quadrado_deveria_ter_perimetro_correto() {
        Quadrado q = new Quadrado(5);
        return q.perimetro() == 20;
    }

    public boolean um_quadrado_deveria_poder_ser_escalado() {
        Quadrado q = new Quadrado(6);
        q.escalar(2);
        return q.getLado() == 12;
    }

    public boolean um_quadrado_nao_deveria_poder_ser_escalado_com_fator_negativo() {
        try {
            Quadrado q = new Quadrado(7);
            q.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_quadrado_nao_deveria_poder_ser_escalado_com_fator_zero() {
        try {
            Quadrado q = new Quadrado(8);
            q.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_quadrado_nao_deveria_ter_lado_negativo() {
        try {
            Quadrado q = new Quadrado(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_quadrado_nao_deveria_ter_lado_zero() {
        try {
            Quadrado q = new Quadrado(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_quadrado_nao_deveria_ter_lado_negativo_ao_ser_modificado() {
        Quadrado q = new Quadrado(1);
        try {
            q.setLado(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_quadrado_nao_deveria_ter_lado_zero_ao_ser_modificado() {
        Quadrado q = new Quadrado(2);
        try {
            q.setLado(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
