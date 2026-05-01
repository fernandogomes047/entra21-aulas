package POO.Basico.Abstracao.Atividades.Exercicio01;

public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Thor");
        Animal gato = new Gato("Ozzy");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
