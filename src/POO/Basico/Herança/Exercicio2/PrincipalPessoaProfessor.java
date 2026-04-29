package POO.Basico.Herança.Exercicio2;

public class PrincipalPessoaProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Fernando", "fernando@entra21.com.br", "Java");

        professor.apresentar();
        System.out.println("Email: " + professor.getEmail());
        System.out.println("Disciplina: " + professor.getDisciplina());
    }
}
