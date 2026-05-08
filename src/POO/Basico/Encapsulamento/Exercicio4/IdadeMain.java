package POO.Basico.Encapsulamento.Exercicio4;


import java.util.Scanner;

public class IdadeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Idade idade = new Idade();

        System.out.println("Digite a idade: ");
        int valorDigitado = scanner.nextInt();

        idade.setAnos(valorDigitado);

        System.out.println("Idade digitada: " + idade.getAnos());

        scanner.close();

    }
}
