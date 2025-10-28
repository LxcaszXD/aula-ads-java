import java.util.Scanner;

public class descontoLoja {
    public static void main(String[] args) {
        try(var scanner = new Scanner(System.in)){

            System.out.print("Digite o valor do produto: R$");
            var valor = scanner.nextDouble();
            var desconto = valor - (valor * 0.1);

            System.out.printf("Valor com desconto: R$%.2f", desconto);
        }
    }
}
