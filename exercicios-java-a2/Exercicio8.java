import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        var salario = sc.nextDouble();
        System.out.print("Digite o número de pendências: ");
        var pendencias = sc.nextInt();
        if (!(salario > 2500.0 && pendencias <= 2)) {
            System.out.println("Empréstimo não aprovado!");
        } else {
            System.out.println("Empréstimo aprovado!\n");
            System.out.print("Digite o valor do empréstimo: R$ ");
            var valor = sc.nextDouble();
            System.out.print("Digite o número de parcelas: ");
            var parcelas = sc.nextInt();
            if (parcelas <= 0) {
                System.out.println("Número de parcelas inválido.\n");
            } else {
                var juros = valor * 0.9 * parcelas / 100.0;
                var total = valor + juros;
                var parcela = total / parcelas;
                System.out.printf("\nValor de cada parcela: R$ %.2f%n", parcela);
                System.out.printf("Valor total do financiamento: R$ %.2f%n", total);
                System.out.printf("Juros totais: R$ %.2f%n", juros);
            }
        }
        sc.close();
    }
}
