package POO.Basico.Polimorfismo.Exemplo1;

public class Principal {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Animal rex = new Cachorro();
        Animal ozzy = new Gato();

        animalGenerico.emitirSom();
        rex.emitirSom();
        ozzy.emitirSom();
    }
}
