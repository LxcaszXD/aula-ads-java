import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu peso (em Kg): ");
        peso = teclado.nextDouble();
        System.out.println("Digite sua altura (em M): ");
        altura = teclado.nextDouble();
        imc = peso / (altura * altura);
        System.out.println("O IMC da pessoa é: " + imc + " Kg/M²");
    }
}