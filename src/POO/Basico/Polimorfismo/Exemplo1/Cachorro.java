package POO.Basico.Polimorfismo.Exemplo1;

import java.sql.SQLOutput;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
