import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0;
        var menor = Double.POSITIVE_INFINITY;
        System.out.println("Digite um número (digite 0 para encerrar):");
        while (true) {
            System.out.print("Número: ");
            var valor = sc.nextDouble();
            if (valor == 0.0) break;
            if (valor > 0) positivos++; else negativos++;
            if (valor < menor) menor = valor;
        }
        if (menor == Double.POSITIVE_INFINITY) {
            System.out.println("Nenhum número informado. Tente novamente!");
        } else {
            System.out.println("Quantidade positivos: " + positivos);
            System.out.println("Quantidade negativos: " + negativos);
            System.out.println("Menor valor: " + menor);
        }
        sc.close();
    }
}
