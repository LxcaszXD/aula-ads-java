import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso (kg): ");
        var peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        var altura = sc.nextDouble();
        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        if (altura <= 0) {
            System.out.println("Altura inválida.");
        } else {
            var imc = peso / (altura * altura);
            System.out.printf("IMC: %.2f%n", imc);
            var cond = "Indefinido";
            if (sexo == 'F') {
                if (imc < 19.1) cond = "Abaixo do peso";
                else if (imc < 25.8) cond = "No peso normal";
                else if (imc < 27.3) cond = "Marginalmente acima do peso";
                else if (imc < 32.3) cond = "Acima do peso ideal";
                else cond = "Obeso";
            } else if (sexo == 'M') {
                if (imc < 20.7) cond = "Abaixo do peso";
                else if (imc < 26.4) cond = "No peso normal";
                else if (imc < 27.8) cond = "Marginalmente acima do peso";
                else if (imc < 31.1) cond = "Acima do peso ideal";
                else cond = "Obeso";
            } else {
                cond = "Sexo invalido";
            }
            System.out.println(cond);
        }
        sc.close();
    }
}
