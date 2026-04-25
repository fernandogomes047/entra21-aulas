package POO.Basico.Encapsulamento.Exercicios1;

public class LivroPrincipal {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
    }
}
