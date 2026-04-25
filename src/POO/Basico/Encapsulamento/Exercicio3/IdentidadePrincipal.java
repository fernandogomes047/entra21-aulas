package POO.Basico.Encapsulamento.Exercicio3;

public class IdentidadePrincipal {
    public static void main(String[] args) {

        Identidade identidade = new Identidade("123.456.789-00", "Fernando Gomes");

        System.out.println(identidade.getCpf());
        System.out.println(identidade.getNome());
    }
}
