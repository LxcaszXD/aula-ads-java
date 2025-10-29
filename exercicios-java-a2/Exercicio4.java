import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de Lanches:");
        System.out.println("[1] - Hambúrguer (R$ 10)");
        System.out.println("[2] - Cachorro-quente (R$ 7)");
        System.out.println("[3] - Batata Frita (R$ 5)");
        System.out.print("Escolha seu lanche: ");
        var escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu: Hambúrguer");
                System.out.println("Valor a pagar: R$10.00");
                break;
                case 2:
                System.out.println("Você escolheu: Cachorro-quente");
                System.out.println("Valor a pagar: R$7.00");
                break;
                case 3:
                System.out.println("Você escolheu: Batata Frita");
                System.out.println("Valor a pagar: R$5.00");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente!");
        }
        sc.close();
    }
}
