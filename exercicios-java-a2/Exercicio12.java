import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var count = 0;
        var somaIdade = 0;
        var somaSalariosHomens = 0.0;
        var countHomens = 0;
        var salarioMulheresAbaixo = 0;
        System.out.println("Digite idade (negativa para encerrar), sexo (M/F) e salário:");
        while (true) {
            System.out.print("Idade (negativa para encerrar): ");
            var idade = sc.nextInt();
            if (idade < 0) break;
            System.out.print("Sexo (M/F): ");
            var sexo = sc.next().toUpperCase().charAt(0);
            System.out.print("Salario (R$): ");
            var salario = sc.nextDouble();
            count++;
            somaIdade += idade;
            if (sexo == 'M') {
                somaSalariosHomens += salario;
                countHomens++;
            } else if (sexo == 'F') {
                if (salario < 600.0) salarioMulheresAbaixo++;
            }
        }
        if (count > 0) {
            System.out.printf("Média de idade do grupo: %.2f\n", (double)somaIdade / count);
        } else {
            System.out.println("Nenhum habitante informado. Tente novamente!");
        }
        if (countHomens > 0) {
            System.out.printf("Média de salarios dos homens: R$ %.2f\n", somaSalariosHomens / countHomens);
        } else {
            System.out.println("Não há homens cadastrados.");
        }
        System.out.println("Quantidade de mulheres com salario abaixo de R$600,00: " + salarioMulheresAbaixo);
        sc.close();
    }
}
