import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var totalAlunos = 20;
        int aprovados = 0, exame = 0, reprovados = 0;
        var somaNotas = 0.0;
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.printf("Digite a nota do aluno %d - nota (0-10): ", i);
            var nota = sc.nextDouble();
            System.out.printf("Digite a quantidade de faltas do aluno %d - faltas (0-60): ", i);
            var faltas = sc.nextInt();
            somaNotas += nota;
            boolean frequenciaOk = (faltas <= 15);
            if (nota >= 6.0 && frequenciaOk) {
                aprovados++;
            } else if (nota >= 3.0 && nota < 6.0 && frequenciaOk) {
                exame++;
            } else {
                reprovados++;
            }
        }
        var media = somaNotas / totalAlunos;
        System.out.println("Quantidade aprovados: " + aprovados);
        System.out.println("Quantidade exame: " + exame);
        System.out.println("Quantidade reprovados: " + reprovados);
        System.out.printf("Media da turma: %.2f%n", media);
        sc.close();
    }
}
