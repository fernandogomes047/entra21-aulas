package POO.Basico.Encapsulamento.Exercicio2;

public class CarroPrincipal {
    public static void main(String[] args) {
        Carro carro = new Carro("Wolks", "Fusca");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
    }
}
