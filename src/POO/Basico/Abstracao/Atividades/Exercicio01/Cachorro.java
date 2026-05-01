package POO.Basico.Abstracao.Atividades.Exercicio01;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro " + nome + " Auau!");

    }
}

