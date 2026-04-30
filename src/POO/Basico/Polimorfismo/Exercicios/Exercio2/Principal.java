package POO.Basico.Polimorfismo.Exercicios.Exercio2;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculoGenerico = new Veiculo();
        Veiculo ferrari = new Carro();
        Veiculo caloi = new Bicicleta();

        veiculoGenerico.mover();
        ferrari.mover();
        caloi.mover();
    }
}
