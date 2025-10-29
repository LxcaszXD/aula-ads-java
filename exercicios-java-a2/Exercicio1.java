import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância percorrida (em km): ");
        var km = sc.nextDouble();
        System.out.print("Digite a quantidade de combustível consumidos(em litros): ");
        var litros = sc.nextDouble();
        if (litros <= 0) {
            System.out.println("Erro: litros não pode ser zero ou negativo. Tente novamente!");
        } else {
            var consumo = km / litros;
            System.out.printf("Consumo medio: %.2f km/l%n", consumo);
        }
        sc.close();
    }
}
