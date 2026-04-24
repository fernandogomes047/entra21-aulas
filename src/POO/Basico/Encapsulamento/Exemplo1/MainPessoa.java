package POO.Basico.Encapsulamento.Exemplo1;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(null);
        pessoa.setNome("");
        pessoa.apresentar();
    }
}
