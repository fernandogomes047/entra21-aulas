package POO.Basico.Exercicios;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "José";

        aluno1.estudar();
        aluno2.estudar();
    }
}
