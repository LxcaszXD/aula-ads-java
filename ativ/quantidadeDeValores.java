package ativ;

import java.util.Scanner;

public class quantidadeDeValores {
    public static void main(String[] args) {
        int n;
        double v, m, s = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        n = teclado.nextInt();

        for (int c = 1; c <= n; c++) {
            System.out.print("Digite o " + c + "º valor: ");
            v = teclado.nextDouble();
            s += v;
        }

        m = s / n;
        System.out.printf("A média é: %.2f \nA soma do valores é: %.2f", m, s);
        
        teclado.close();
    }
}
