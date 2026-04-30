package POO.Basico.Polimorfismo.Exercicios.Exercio5;

public class Principal {
    public static void main(String[] args) {
        Instrumento instrumentoGenerico = new Instrumento();
        Instrumento violao = new Violao();
        Instrumento piano = new Piano();
        Instrumento bateria = new Bateria();

        instrumentoGenerico.tocar();
        violao.tocar();
        piano.tocar();
        bateria.tocar();
    }
}
