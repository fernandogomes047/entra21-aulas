package POO.Basico.Abstracao.Exemplo1.ClasseAbstrata;

public class PrincipalFormaGeometrica {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);

        Retangulo retangulo = new Retangulo(3,4);

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("A área do circulo é " + areaCirculo);
        System.out.println("A área do retangulo é " + areaRetangulo);

        FormaGeometricaAbstract quadrado = new Retangulo(2, 2);
        System.out.println("Área do quadrado é " + quadrado.calcularArea());
    }
}
