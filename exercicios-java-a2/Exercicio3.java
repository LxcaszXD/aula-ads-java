import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: R$ ");
        var valor = sc.nextDouble();
        var desconto = valor * 0.10;
        var finalValor = valor - desconto;
        System.out.printf("Valor com desconto: R$ %.2f%n", finalValor);
        sc.close();
    }
}
