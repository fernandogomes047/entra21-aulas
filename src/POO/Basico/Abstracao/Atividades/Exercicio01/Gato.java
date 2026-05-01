package POO.Basico.Abstracao.Atividades.Exercicio01;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato " + nome + " miaumiau");

    }

}

