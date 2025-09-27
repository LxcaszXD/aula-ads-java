package aula7;

import java.util.Scanner;

public class diaria {
    public static void main(String[] args) {
        char diaria;
        double valor;
        int quantidade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o tipo de diária (S, D ou T): ");
        diaria = entrada.next().charAt(0);
        System.out.println("Informe o número de diárias: ");
        quantidade = entrada.nextInt();

        if (diaria == 's' || diaria == 'S') {
            valor = 255.40 * quantidade;
            System.out.printf("Sua reserva ficará no valor de: R$ %.2f", valor);
        } else if (diaria == 'd' || diaria == 'D') {
            valor = 305.40 * quantidade;
            System.out.printf("Sua reserva ficará no valor de: R$ %.2f", valor);
        } else if (diaria == 't' || diaria == 'T') {
            valor = 360.50 * quantidade;
            System.out.printf("Sua reserva ficará no valor de: R$ %.2f", valor);
        } else {
            System.out.println("Tipo de diária inválido!!!");
        }
    }
}
