package aula9;

import java.util.Scanner;

public class churras {
    public static void main(String[] args) {
        String item;
        int qtde;
        double valorUnit, valorTotItem, valorCompras;
        valorCompras = 0;
        int itensNro = 2;
        int x = 1;
        String compras = "";

        System.out.println("*** Churras da turma ***");
        Scanner entrada = new Scanner(System.in);

        while (x <= itensNro) {
            System.out.println("Informe o " + x + "° item: ");
            item = entrada.nextLine();
            System.out.println("Quantidade: ");
            qtde = Integer.valueOf(entrada.nextLine());
            System.out.println("Valor unitário: ");
            valorUnit = Double.valueOf(entrada.nextLine());
            valorTotItem = qtde * valorUnit;
            valorCompras = valorCompras + valorTotItem;
            compras = compras + item + " - " + qtde + " - " + valorTotItem + "\n";
            x++;
        }
        System.out.println(compras);
        System.out.println("Total da compra: " + valorCompras);
    }
}
