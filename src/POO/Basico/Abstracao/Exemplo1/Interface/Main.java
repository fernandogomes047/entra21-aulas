package POO.Basico.Abstracao.Exemplo1.Interface;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(3, 4);

        System.out.println("A área do círculo é " + circulo.calcularArea());
        System.out.println("A área do retangulo é " + retangulo.calcularArea());

        IFormaGeometrica interfaceFormaGeometrica = new Circulo(2);
        interfaceFormaGeometrica.calcularArea();
    }
}
