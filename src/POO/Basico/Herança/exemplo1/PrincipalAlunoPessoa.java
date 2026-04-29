package POO.Basico.Herança.exemplo1;

public class PrincipalAlunoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(18, "Fernando");
        Aluno aluno = new Aluno("luigi", 18  , "123456");

        aluno.apresentar();
        System.out.println("Descrição aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matricula aluno: " + aluno.getMatricula());
    }
}
