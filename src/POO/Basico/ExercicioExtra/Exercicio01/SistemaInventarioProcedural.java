package POO.Basico.ExercicioExtra.Exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaInventarioProcedural {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Inventário");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Calcular Valor Total do Estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    Produto produto = new Produto(nome, preco, quantidade);
                    produtos.add(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de Produtos");
                    for (Produto p : produtos) {
                        p.exibirDetalhes();
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Produto p : produtos) {
                        total += p.getPreco() * p.getQuantidade();
                    }
                    System.out.println("Valor total do estoque: R$ " + total);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao !=0);
        scanner.close();
    }
}
