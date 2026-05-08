package POO.Basico.ExercicioExtra.Exercicio01;

public class Produto {

    //Atributos

    private String nome;
    private double preco;
    private int quantidade;

    //Construtor

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Metodo Get

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Metodo Set

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Aviso: Preço negativo. Redefinindo como 0.");
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Metodo para exibir detalhes

    public void exibirDetalhes() {
        System.out.println("Produto " + nome + "| Preço: R$ " + preco + "| Quantidade: " + quantidade);
    }
}
