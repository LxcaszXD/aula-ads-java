import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        String nome;
        double n1, n2, n3, n4, nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = teclado.nextLine();
        System.out.println("Digite as 4 notas: ");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        n4 = teclado.nextDouble();
        nota = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média do " + nome + " é: " + nota);
    }
}