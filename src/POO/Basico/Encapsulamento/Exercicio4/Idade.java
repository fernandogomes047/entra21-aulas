package POO.Basico.Encapsulamento.Exercicio4;

public class Idade {
    private int anos;

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        if (anos >= 0 && anos <= 150) {
        this.anos = anos;
    } else {
            System.out.println("Erro: Idade deve estar entre 0 e 150 anos");
        }
    }
}
