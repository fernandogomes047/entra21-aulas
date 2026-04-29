package POO.Basico.Polimorfismo.Exemplo3;

public class Pix extends MetodoPagamento {

    @Override
    public void pagarAVista() {
        System.out.println("Pagando com Pix");
    }
}
