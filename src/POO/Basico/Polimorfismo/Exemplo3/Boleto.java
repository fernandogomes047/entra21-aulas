package POO.Basico.Polimorfismo.Exemplo3;

public class Boleto extends MetodoPagamento {

    @Override
    public void pagarAVista() {
        System.out.println("Pagando com Boleto");
    }
}
