package aula5;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        idade = teclado.nextInt();
        System.out.println("A idade é: " + idade);
        if (idade >= 18) {
            System.out.println("você é maior de idade");
        }else{
            System.out.println("você é menor de idade");
        }
    }
    
}
