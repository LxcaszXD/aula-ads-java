import java.util.Scanner;

public class mediacopy {
    public static void main(String[] args) {
        String nome;
        double n1, n2, n3, n4, nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = teclado.nextLine();
        System.out.println("Digite a 1º nota: ");
        n1 = teclado.nextDouble();
        System.out.println("Digite a 2º nota: ");
        n2 = teclado.nextDouble();
        System.out.println("Digite a 3º nota: ");
        n3 = teclado.nextDouble();
        System.out.println("Digite a 4º nota: ");
        n4 = teclado.nextDouble();
        nota = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média do " + nome + " é: " + nota);
    }
}