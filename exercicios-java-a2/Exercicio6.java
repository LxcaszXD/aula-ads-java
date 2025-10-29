import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número (inteiro e positivo): ");
        var n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Valor inválido. O número deve ser inteiro e positivo!");
        } else {
            var s = 0.0;
            for (int i = 1; i <= n; i++) {
                s += 1.0 / i;
            }
            System.out.printf("S = %.6f%n", s);
        }
        sc.close();
    }
}
