import java.util.Scanner;
import java.util.InputMismatchException;

public class calcConsumo {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)){
            var km = obterValor(scanner, "distância percorrida (em km)");
            var combustivel = obterValor(scanner, "quantidade de combustível consumido (em litros)");
            System.out.printf("Consumo médio do veículo: %.2f km/lL", km / combustivel);
        }
    }

    public static double obterValor(Scanner scanner, String message){
        var valor = 0.0;

        while (true) {
            System.out.printf("Digite a %s: ", message);
            try {
                valor = scanner.nextDouble();
                if (valor > 0) {
                    return valor;
                }else{
                    System.out.printf("O valor não pode ser 0 ou negativo. Tente novamente!%n%n");
                }
                
            } catch (InputMismatchException e) {
                System.out.printf("O valor deve ser um número. Tente novamente!%n%n");
                scanner.nextLine();
            }
        }
    }
}