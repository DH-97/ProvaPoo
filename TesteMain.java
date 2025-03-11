public class TesteMain {
    public static void main(String[] args) {
        // String[] testes = {"figura-circulo", "figura-quadrado", "figura-retangulo"};
        String[] testes = {"figura", "poligono", "circulo", "retangulo", "quadrado", "figura3d", "cubo", "esfera", "cilindro"};
        for (String teste : testes) {
            Teste t = TesteFactory.getTestes(teste);
            System.out.println("Testando " + teste);
            System.out.println(t.testar());
        }
    }
}
