import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alturaH = 0.0, alturaF = 0.0;
        int countH = 0, countF = 0;
        System.out.println("Digite o sexo (M/F) e a altura (em m). Digite 'X' para encerrar.");
        while (true) {
            System.out.print("Sexo M/F (X para sair): ");
            var s = sc.next();
            if (s.equalsIgnoreCase("X")) break;
            var sexo = s.toUpperCase().charAt(0);
            System.out.print("Altura (m): ");
            var altura = sc.nextDouble();
            if (sexo == 'M') {
                alturaH += altura; countH++;
            } else if (sexo == 'F') {
                alturaF += altura; countF++;
            } else {
                System.out.println("Sexo inválido, registro ignorado!");
            }
        }
        if (countF > 0) System.out.printf("Altura média das mulheres: %.2f m\n", alturaF / countF);
        else System.out.println("Não há mulheres registradas.");
        if (countH > 0) System.out.printf("Altura média dos homens: %.2f m\n", alturaH / countH);
        else System.out.println("Não há homens registrados.");
        sc.close();
    }
}
