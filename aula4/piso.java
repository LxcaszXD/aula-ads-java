import java.util.Scanner;

public class piso {
    public static void main(String[] args) {
        double l1, l2, area, caixa = 2.5, quantidade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os lados da área (em M):");
        l1 = entrada.nextDouble();
        l2 = entrada.nextDouble();
        area = l1 * l2;
        quantidade = area / caixa;

        System.out.println("Será necessário " + quantidade + " caixas para " + area + "M²");
        
    }
}
