import java.util.Scanner;

public class selecaoResturante {
    public static void main(String[] args) {
        try(var scanner = new Scanner(System.in)){
            System.out.print("Menu\n[1] - Hambúrguer (R$10)\n[2] - Cachorro-quente (R$7)\n[3] - Batata Frita (R$5)\nEscolha seu lanche: ");
            var escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Você escolheu: Hambúrguer\nValor a pagar: R$10.00");
                    break;
                case 2:
                    System.out.print("Você escolheu: Cachorro-quente\nValor a pagar: R$7.00");
                    break;
                case 3:
                    System.out.print("Você escolheu: Batata Frita\nValor a pagar: R$5.00");
                    break;
            
                default:
                    break;
            }
        }
    }
}
