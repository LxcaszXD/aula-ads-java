package ativ;

import java.util.Scanner;

public class calculoDeValor {
    public static void main(String[] args) {
        int n;
        double s = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        n = teclado.nextInt();

        for (int v = 1; v <= n; v++) {
            double anterior = s;
            s = s + 1.0 / v;

            System.out.printf("%.2f = %.2f + 1/%d%n", s , anterior, v);
        }
        System.out.printf("Soma final = %.2f", s);
    }
}
