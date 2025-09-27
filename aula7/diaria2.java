package aula7;

import java.util.Scanner;

public class diaria2 {
    public static void main(String[] args) {
        char diaria;
        double valor;
        int quantidade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o tipo de diária (S, D ou T): ");
        diaria = entrada.next().charAt(0);
        System.out.println("Informe o número de diárias: ");
        quantidade = entrada.nextInt();

        switch (diaria) {
            case 'S':
            case 's':
                valor = quantidade * 255.40;
                break;
            case 'D':
            case 'd':
                valor = quantidade * 305.40;
                break;
            case 'T':
            case 't':
                valor = quantidade * 360.50;
                break;
            default:
                valor = 0;
                break;
        }

        if (valor > 0) {
            System.out.printf("Sua reserva ficará no valor de: R$ %.2f", valor);
        } else {
            System.out.println("Sua reserva ficará no valor de: R$" + valor);
        }

    }
}
