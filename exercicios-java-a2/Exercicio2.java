import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        var salario = sc.nextDouble();
        System.out.print("Digite o número de pendências: ");
        var pendencias = sc.nextInt();
        if (salario > 2500.00 && pendencias <= 2) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo não aprovado!");
        }
        sc.close();
    }
}
