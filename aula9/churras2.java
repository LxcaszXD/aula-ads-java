package aula9;

import java.util.Scanner;

public class churras2 {
    public static void main(String[] args) {
        double valorCompra = 0;
        int itensNro;
        Scanner entrada = new Scanner(System.in);

        System.out.println("*** Churras da turma 2 ***");
        System.out.println("Quantos itens para o churrasco? ");
        itensNro = Integer.valueOf(entrada.nextLine());
        String item[] = new String[itensNro];
        int qtde[] = new int[itensNro];
        double valorUnit[] = new double[itensNro];

        for (int x = 0; x < itensNro ; x++) {
            System.out.println("Informe o " + (x+1) + "° item: ");
            item[x] = entrada.nextLine();
            System.out.println("Quantidade: ");
            qtde[x] = Integer.valueOf(entrada.nextLine());
            System.out.println("Valor unitário: ");
            valorUnit[x] = Double.valueOf(entrada.nextLine());
        }

        for (int x = 0; x < itensNro; x++) {
            double valorTotItem = qtde[x] * valorUnit[x];
            valorCompra += valorTotItem; // valorCompra = valorCompra + valorTotItem
            System.out.println(item[x] + " - " + qtde[x] + " - " + valorTotItem);
        }

        System.out.println("Valor total da compra: " + valorCompra);
    }
}
