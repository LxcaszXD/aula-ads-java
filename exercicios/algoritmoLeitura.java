import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmoLeitura {
    public static void main(String[] args) {
        try(var scanner = new Scanner(System.in)){
            var n = obterValor(scanner);

            for (int i = 0; i < n; i++) {
                System.out.println();
            }
        }
    }

    public static int obterValor(Scanner scanner){
        var n = 0;

        while (true) {
            System.out.print("Digite um número: ");
            try {
                n = scanner.nextInt();
                if (n > 0) {
                    return n;
                }else{
                    System.out.println("O número deve ser maio que 0 e positivo. Tente novamente!\n\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("O valor deve ser um número. Tente novamente!");
                scanner.nextLine();
            }
        }
    }
}
